package com.company.Like;

import com.company.Utilisateur.Utilisateur;
import com.company.Video.Video;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LikeApi {
    static Map<Video, List<Like>> likesByVideo = new HashMap<Video, List<Like>>();

    public static void like(Utilisateur user, Video video) {
        List<Like> list = new ArrayList<Like>(likesByVideo.get(video));
        for(Like like : list) {
            if (like.getUtilisateur().equals(user)) {
                System.out.println("user already liked");
                return;
            }
        }
        list.add(new Like(user, video, true));
        likesByVideo.put(video, list);
        return;
    }
    public static void dislike(Utilisateur user, Video video) {
    }
    public static List<Like> list(Video video) {
        return likesByVideo.get(video.hashCode());
    }
}
