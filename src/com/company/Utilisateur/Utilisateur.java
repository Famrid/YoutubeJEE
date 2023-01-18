package com.company.Utilisateur;

import com.company.Like.Like;
import com.company.Video.Video;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Utilisateur {
    private String pseudo;
    private Date dateNaissance;
    private Collection<Like> arrayLike;
    private Collection<Video> arrayVideo;

    public Utilisateur(String pseudo, Date dateNaissance) {
        this.pseudo = pseudo;
        this.dateNaissance = dateNaissance;
        this.arrayLike = new ArrayList<Like>();
        this.arrayVideo = new ArrayList<Video>();
    }

    public Collection<Like> getArrayLike() {
        return arrayLike;
    }

    public void setArrayLike(Collection<Like> arrayLike) {
        this.arrayLike = arrayLike;
    }

    public Collection<Video> getArrayVideo() {
        return arrayVideo;
    }

    public void setArrayVideo(Collection<Video> arrayVideo) {
        this.arrayVideo = arrayVideo;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
}
