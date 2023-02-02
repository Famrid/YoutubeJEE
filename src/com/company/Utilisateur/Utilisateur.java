package com.company.Utilisateur;

import com.company.Chaine.Chaine;
import com.company.Like.Like;
import com.company.Video.Video;

import java.util.*;

public class Utilisateur {
    private String pseudo;
    private String password;
    private Date dateNaissance;
    private Chaine chainePossedee;
    private List<Chaine> chaineAbonee;
    private List<Like> arrayLike;
    private List<Video> arrayVideo;


    public Utilisateur(String pseudo, Date dateNaissance, String password) {
        this.pseudo = pseudo;
        this.dateNaissance = dateNaissance;
        this.arrayLike = new ArrayList<Like>();
        this.arrayVideo = new ArrayList<Video>();
        this.password = password;
        this.chaineAbonee = new ArrayList<>();
    }

    public Chaine getChainePossedee() {
        return chainePossedee;
    }

    public void setChainePossedee(Chaine chainePossedee) {
        this.chainePossedee = chainePossedee;
    }

    public List<Chaine> getChaineAbonee() {
        return  chaineAbonee;
    }

    public void setChaineAbonee(List<Chaine> chaineAbonee) {
        this.chaineAbonee = chaineAbonee;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public List<Like> getArrayLike() {
        return arrayLike;
    }

    public void setArrayLike(List<Like> arrayLike) {
        this.arrayLike = arrayLike;
    }

    public List<Video> getArrayVideo() {
        return arrayVideo;
    }

    public void setArrayVideo(List<Video> arrayVideo) {
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

    public void addLike(Like like) {
        this.arrayLike.add(like);
    }

    public void addVideo(Video video) {
        this.arrayVideo.add(video);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Utilisateur that = (Utilisateur) o;
        return pseudo.equals(that.pseudo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pseudo);
    }
}
