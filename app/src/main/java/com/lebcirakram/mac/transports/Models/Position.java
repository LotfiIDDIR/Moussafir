package com.lebcirakram.mac.transports.Models;

/**
 * Created by mac on 7/17/17.
 */

public class Position {

    private Double Lat;
    private Double Lng;
    private String Adress;
    private String Nom;

    Position(){}

    public Position(Double lat, Double lng, String adress, String nom) {
        Lat = lat;
        Lng = lng;
        Adress = adress;
        Nom = nom;
    }

    public Double getLat() {
        return Lat;
    }

    public void setLat(Double lat) {
        Lat = lat;
    }

    public Double getLng() {
        return Lng;
    }

    public void setLng(Double lng) {
        Lng = lng;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }
}
