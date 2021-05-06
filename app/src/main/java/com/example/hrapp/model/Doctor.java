package com.example.hrapp.model;

public class Doctor {
    String key;
    String photo;
    String name;
    String exper;
    String number;

    public Doctor(String key,String photo, String name, String exper, String number) {
        this.key = key;
        this.photo = photo;
        this.name = name;
        this.exper = exper;
        this.number = number;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getPhoto(){
        return photo;
    }

    public String setPhoto(String photo){
        return photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExper() {
        return exper;
    }

    public void setExper(String exper) {
        this.exper = exper;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
