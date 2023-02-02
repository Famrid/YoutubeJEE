package com.company.Video;

import com.company.Utilisateur.Utilisateur;

import java.util.List;

public class VideoApi {
    private List<Video> listeVideo;

    public List<Video> getListeVideo() {
        return listeVideo;
    }

    public void setListeVideo(List<Video> listeVideo) {
        this.listeVideo = listeVideo;
    }

    public static List<Video> listByCreator(Utilisateur user) {
        return user.getArrayVideo();
    }
    public static Video uploadVideo(Video video, Utilisateur user) {
        user.addVideo(video);
        return video;
    }
}
