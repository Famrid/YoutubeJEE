package Video;


import Like.Like;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Video {
    private int duree;
    private String titre;
    private Date datePublication;
    private Collection<Like> tableauLike;

    public Video(int duree, String titre, Date datePublication) {
        this.duree = duree;
        this.titre = titre;
        this.datePublication = datePublication;
        this.tableauLike = new ArrayList<Like>();
    }

    public int getDuree() {
        return duree;
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

    public Date getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(Date datePublication) {
        this.datePublication = datePublication;
    }
}
