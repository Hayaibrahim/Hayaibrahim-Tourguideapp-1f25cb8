package com.example.enghaya.tourguideapp;

/**
 * Created by ENG.HAYA on 8/21/2017 AD.
 */

public class information {
    String name ;
    int image ;
    String address , location ;

    public information(String name , String address, String location, int image ) {
        this.name = name;
        this.image = image;
        this.address = address;
        this.location = location;
     }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public String getAddress() {
        return address;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "information{" +
                "name='" + name + '\'' +
                ", image=" + image +
                ", address='" + address + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
