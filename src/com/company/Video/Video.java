package com.company.Video;


import com.company.Chaine.Chaine;
import com.company.Like.Like;
import com.company.Utilisateur.Utilisateur;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;


public class Video {
    private int duree;
    private String titre;
    private LocalDate datePublication;
    private Categorie categorie;
    private Utilisateur utilisateur;
    private Chaine chaine;
    private List<Like> tableauLike;
    private static Integer nombreDeVideos = 0;

    public Video(int duree, String titre, Utilisateur utilisateur, Categorie categorie, Chaine chaine) {
        this.duree = duree;
        this.titre = titre;
        this.datePublication = LocalDate.now();
        this.tableauLike = new ArrayList<Like>();
        this.utilisateur = utilisateur;
        this.categorie = categorie;
        this.chaine = chaine;
        nombreDeVideos++;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public Chaine getChaine() {
        return chaine;
    }

    public void setChaine(Chaine chaine) {
        this.chaine = chaine;
    }

    public int getDuree() {
        return duree;
    }

    public static Integer getNombreDeVideos() {
        return nombreDeVideos;
    }

    public static void setNombreDeVideos(Integer nombreDeVideos) {
        Video.nombreDeVideos = nombreDeVideos;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public List<Like> getTableauLike() {
        return tableauLike;
    }

    public void setTableauLike(List<Like> tableauLike) {
        this.tableauLike = tableauLike;
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

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Video video = (Video) o;
        return titre.equals(video.titre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titre);
    }
}
