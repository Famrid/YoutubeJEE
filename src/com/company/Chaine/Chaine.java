package com.company.Chaine;

import com.company.Utilisateur.Utilisateur;
import com.company.Video.Video;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Chaine {
    private String nom;
    private String owner;
    private HashMap<String, Utilisateur> subsribers;
    private List<Video> liste;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public HashMap<String, Utilisateur> getSubsribers() {
        return subsribers;
    }

    public void setSubsribers(HashMap<String, Utilisateur> subsribers) {
        this.subsribers = subsribers;
    }

    public void setListe(List<Video> liste) {
        this.liste = liste;
    }

    public List<Video> getListe() {
        return liste;
    }

    public Chaine(String nom, String owner) {
        this.nom = nom;
        this.owner = owner;
        this.subsribers = new HashMap<>();
        this.liste = new ArrayList<>();
    }
    public String getNom() {
        return nom;
    }
}
