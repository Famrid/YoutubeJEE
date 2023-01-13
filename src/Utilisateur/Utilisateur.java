package Utilisateur;

import Like.Like;
import Video.Video;

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
