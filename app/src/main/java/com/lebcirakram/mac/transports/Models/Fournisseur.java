package com.lebcirakram.mac.transports.Models;

import java.util.ArrayList;

/**
 * Created by mac on 7/15/17.
 */

public class Fournisseur extends Utilisateur {

    private int NbrPlace;
    private Position depart;
    private Position arrivee;
    private String MoyenTransport;
    private int time;
    private ArrayList<Arret> arret;
    private int NbrArret;

    public Fournisseur(){}

    public Fournisseur(String uid,String name, String mail, String type, int nbrPlace, Position depart, Position arrivee, String moyenTransport, ArrayList<Arret> arret, int nbrArret,int time) {
        super(uid, name,mail, type);
        NbrPlace = nbrPlace;
        this.depart = depart;
        this.arrivee = arrivee;
        MoyenTransport = moyenTransport;
        this.arret = arret;
        NbrArret = nbrArret;
        this.time = time;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNbrPlace() {
        return NbrPlace;
    }

    public void setNbrPlace(int nbrPlace) {
        NbrPlace = nbrPlace;
    }

    public Position getDepart() {
        return depart;
    }

    public void setDepart(Position depart) {
        this.depart = depart;
    }

    public Position getArrivee() {
        return arrivee;
    }

    public void setArrivee(Position arrivee) {
        this.arrivee = arrivee;
    }

    public String getMoyenTransport() {
        return MoyenTransport;
    }

    public void setMoyenTransport(String moyenTransport) {
        MoyenTransport = moyenTransport;
    }

    public ArrayList<Arret> getArret() {
        return arret;
    }

    public void setArret(ArrayList<Arret> arret) {
        this.arret = arret;
    }

    public int getNbrArret() {
        return NbrArret;
    }

    public void setNbrArret(int nbrArret) {
        NbrArret = nbrArret;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
