package com.company.Video;


import com.company.Like.Like;
import com.company.Utilisateur.Utilisateur;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;


public class Video {
    private int duree;
    private String titre;
    private LocalDate datePublication;
    private Utilisateur utilisateur;
    private Collection<Like> tableauLike;
    private Collection<Video> tableauVideo;

    public Video(int duree, String titre, Utilisateur utilisateur) {
        this.duree = duree;
        this.titre = titre;
        this.datePublication = LocalDate.now();
        this.tableauLike = new ArrayList<Like>();
        this.tableauVideo = new ArrayList<Video>();
        this.utilisateur = utilisateur;
    }

    public int getDuree() {
        return duree;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Collection<Like> getTableauLike() {
        return tableauLike;
    }

    public void setTableauLike(Collection<Like> tableauLike) {
        this.tableauLike = tableauLike;
    }

    public Collection<Video> getTableauVideo() {
        return tableauVideo;
    }

    public void setTableauVideo(Collection<Video> tableauVideo) {
        this.tableauVideo = tableauVideo;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public LocalDate getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(LocalDate datePublication) {
        this.datePublication = datePublication;
    }
}
