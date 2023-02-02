package com.company.Chaine;

import com.company.Utilisateur.Utilisateur;

import java.util.HashMap;
import java.util.List;

public class Chaine {
    private String nom;
    private String owner;
    private HashMap<String, Utilisateur> subsribers;
    public Chaine(String nom, String owner) {
        this.nom = nom;
        this.owner = owner;
    }
    public String getNom() {
        return nom;
    }
}
