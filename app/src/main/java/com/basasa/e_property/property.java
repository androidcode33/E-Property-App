package com.basasa.e_property;

/**
 * Created by Lincoln on 18/05/16.
 */
public class property {
    private String image ;
    private String date ;
    private String location;
    private String name_property;
    private int prize;
    private String owner_name;

    public property() {
    }
    public property( String image, String date, String location,String name_property,int prize,String owner_name) {
        this.image = image;
        this.date = date;
        this.location = location;
        this.name_property=name_property;
        this.prize=prize;
        this.owner_name=owner_name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName_property() {
        return name_property;
    }

    public void setName_property(String name_property) {
        this.name_property = name_property;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }




}
