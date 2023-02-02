package com.company.Utilisateur;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class UtilisateurApi {
    static Map<String, Utilisateur> listeUtilisateur = new HashMap<String, Utilisateur>();
    public static Utilisateur login(String pseudo, String password) throws IllegalArgumentException, ClassNotFoundException{
        Utilisateur user = listeUtilisateur.get(pseudo);
        if(Objects.nonNull(user) && Objects.equals(user.getPassword(), password)) {
            return user;
        } else if (user == null) {
            throw new ClassNotFoundException("user does not exist");
        } else {
            throw new IllegalArgumentException("incorrect password!");
        }
    }
    public static Utilisateur register(Utilisateur user) {
        listeUtilisateur.put(user.getPseudo(), user);
        return user;
    }

    public static Map<String, Utilisateur> getListeUtilisateur() {
        return listeUtilisateur;
    }

    public void setListeUtilisateur(Map<String, Utilisateur> listeUtilisateur) {
        this.listeUtilisateur = listeUtilisateur;
    }
}
