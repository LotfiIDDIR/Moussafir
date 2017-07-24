package com.lebcirakram.mac.transports.Models;

/**
 * Created by mac on 7/17/17.
 */

public class Arret {

    private Position position;
    private String NomArret;
    private int NbrClient;
    private Double prix;

    Arret(){}

    public Arret(Position position, String nomArret, int nbrClient, Double prix) {
        this.position = position;
        NomArret = nomArret;
        NbrClient = nbrClient;
        this.prix = prix;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getNomArret() {
        return NomArret;
    }

    public void setNomArret(String nomArret) {
        NomArret = nomArret;
    }

    public int getNbrClient() {
        return NbrClient;
    }

    public void setNbrClient(int nbrClient) {
        NbrClient = nbrClient;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }
}
