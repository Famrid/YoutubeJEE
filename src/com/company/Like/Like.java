package com.company.Like;

import com.company.Utilisateur.Utilisateur;
import com.company.Video.Video;

public class Like {
    private Utilisateur utilisateur;
    private Video video;
    private Boolean state;

    public Like(Utilisateur utilisateur, Video video, Boolean state) {
        this.utilisateur = utilisateur;
        this.video = video;
        this.state = state;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
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
