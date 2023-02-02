package com.company;

import com.company.Chaine.Chaine;
import com.company.Chaine.ChaineApi;
import com.company.Like.LikeApi;
import com.company.Utilisateur.Utilisateur;
import com.company.Utilisateur.UtilisateurApi;
import com.company.Video.Categorie;
import com.company.Video.Video;
import com.company.Video.VideoApi;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Utilisateur steven = new Utilisateur("Steven", new Date(1989, 06, 13), "toto");
        Chaine chaine = new Chaine("Ma chaine", "Steven");
        Video video1 = new Video(100, "Toute ma vie", steven, Categorie.HUMOUR, chaine);
        Video video2 = new Video(100, "Toute ma souffrance", steven, Categorie.NATURE, chaine);
        VideoApi.uploadVideo(video1, steven);
        VideoApi.uploadVideo(video2, steven);
        ChaineApi.upload(chaine, video1);
        ChaineApi.upload(chaine, video2);
        ChaineApi.subscribe(steven, chaine);
        List<Video> videos = VideoApi.listByCreator(steven);
        for(Video video: videos) {
            System.out.println(video.getTitre());
        }
        //LikeApi.like(steven, video1);

        UtilisateurApi.register(steven);
        try{
            Utilisateur steven2 = UtilisateurApi.login("Steven", "toto");
            System.out.println(steven2.getPseudo());
        } catch(Exception e) {
            System.out.println((e.getMessage()));
        }
        try{
            Utilisateur steven2 = UtilisateurApi.login("Steven", "tata");
            System.out.println(steven2.getPseudo());
        } catch(Exception e) {
            System.out.println((e.getMessage()));
        }
        try{
            Utilisateur steven2 = UtilisateurApi.login("George", "toto");
            System.out.println(steven2.getPseudo());
        } catch(Exception e) {
            System.out.println((e.getMessage()));
        }
        List<Video> liste = new ArrayList<Video>(ChaineApi.trouveRecommandation(steven));
        for(Video video : liste) {
            System.out.println(video.getTitre());
        }
    }
}
