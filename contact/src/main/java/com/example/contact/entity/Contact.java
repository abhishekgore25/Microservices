package com.example.contact.entity;


public class Contact {

    public int cid;
    public int number;
    public int userid;

    public Contact(int cid, int number, int userid) {
        this.cid = cid;
        this.number = number;
        this.userid = userid;
    }

    public Contact(int cid, int number) {
        this.cid = cid;
        this.number = number;
    }

    public Contact() {
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }
}

