package com.company.Video;

public class VideoTransformer {
    private static Video cloneVideo(Video video) {
        Video clone = new Video(video.getDuree(), video.getTitre(), video.getUtilisateur(), video.getCategorie(), video.getChaine());
        return clone;
    }
}
