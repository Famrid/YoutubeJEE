package com.company.Chaine;

import com.company.Utilisateur.Utilisateur;
import com.company.Video.Video;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class ChaineApi {
    private static List<Chaine> listeDesChaines = new ArrayList<Chaine>();
    private static HashMap<String, ArrayList<Video>> mapVideo = new HashMap<String, ArrayList<Video>>();

    private ChaineApi() {
    }

    public static List<Chaine> getListeDesChaines() {
        return listeDesChaines;
    }

    public static void setListeDesChaines(List<Chaine> listeDesChaines) {
        ChaineApi.listeDesChaines = listeDesChaines;
    }

    public static HashMap<String, ArrayList<Video>> getMapVideo() {
        return mapVideo;
    }

    public static void setMapVideo(HashMap<String, ArrayList<Video>> mapVideo) {
        ChaineApi.mapVideo = mapVideo;
    }

    public static Chaine creer(Utilisateur utilisateur, String nom) {
        listeDesChaines.add(new Chaine(utilisateur.getPseudo(), nom));
        return new Chaine(utilisateur.getPseudo(), nom);
    }

    public static void upload(Chaine chaine, Video video) {
        if(Objects.isNull(mapVideo.get(chaine.getNom()))) {
            ArrayList<Video> newArray = new ArrayList<Video>();
            newArray.add(video);
            video.setChaine(chaine);
            video.getCategorie().addVideo(video);
            mapVideo.put(chaine.getNom(), newArray);
        } else {
            ArrayList<Video> array = mapVideo.get(chaine.getNom());
            array.add(video);
            video.setChaine(chaine);
            video.getCategorie().addVideo(video);
            mapVideo.put(chaine.getNom(), array);
        }
    }

    public static List<Video> trouveRecommandation(Utilisateur utilisateur) {
        List<Video> listeVideo = new ArrayList<>();
        List<Chaine> chaineAbonee = new ArrayList<>(utilisateur.getChaineAbonee());
        for(Chaine chaine : chaineAbonee) {
            for(Video video : mapVideo.get(chaine.getNom())) {
                listeVideo.add(video);
            }
        }
        return listeVideo;
    }

    public static void subscribe(Utilisateur utilisateur, Chaine chaine) {
        utilisateur.getChaineAbonee().add(chaine);
    }
}
