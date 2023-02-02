package com.company.Video;

import java.util.ArrayList;
import java.util.List;

public enum Categorie {
    SPORT("Sport"),
    HUMOUR("Fun"),
    NATURE("environnement");

    private String label;
    private List<Video> listeVideo;

    Categorie(String label) {
        this.label = label;
        this.listeVideo = new ArrayList<Video>();
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Video> getListeVideo() {
        return listeVideo;
    }

    public void setListeVideo(List<Video> listeVideo) {
        this.listeVideo = listeVideo;
    }

    public void addVideo(Video video) {
        this.listeVideo.add(video);
    }
}
