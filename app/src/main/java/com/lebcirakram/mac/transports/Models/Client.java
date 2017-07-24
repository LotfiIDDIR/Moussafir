package com.lebcirakram.mac.transports.Models;

import java.util.ArrayList;

/**
 * Created by mac on 7/17/17.
 */

public class Client extends Utilisateur{

    private int NbrPlace;
    private Position depart;
    private Position arrivee;
    private String MoyenTransport;

    Client(){}

    public Client(String uid,String name, String mail, String type, int nbrPlace, Position depart, Position arrivee, String moyenTransport) {
        super(uid,name, mail, type);
        NbrPlace = nbrPlace;
        this.depart = depart;
        this.arrivee = arrivee;
        MoyenTransport = moyenTransport;
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
}
