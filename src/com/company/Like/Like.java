package com.company.Like;

import com.company.Utilisateur.Utilisateur;
import com.company.Video.Video;

public class Like {
    private Utilisateur utilisateur;
    private Video video;

    public Like(Utilisateur utilisateur, Video video) {
        this.utilisateur = utilisateur;
        this.video = video;
    }

    public Like(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
}
