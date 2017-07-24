package com.lebcirakram.mac.transports.Models;

/**
 * Created by mac on 7/17/17.
 */

public class Utilisateur {

    protected String uid;
    protected String name;
    protected String mail;
    protected String Type;

    Utilisateur(){}

    public Utilisateur(String uid,String name, String mail, String type) {
        this.uid = uid;
        this.mail = mail;
        Type = type;
        this.name = name;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }
}
