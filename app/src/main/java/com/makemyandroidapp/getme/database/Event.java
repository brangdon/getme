package com.makemyandroidapp.getme.database;

import java.io.Serializable;

/**
 * Created by Admin on 2017-06-13.
 */

public class Event implements Serializable{
    private int id;
    private String name;
    private String description;
    private String isLocation;
    private String latitude;
    private String longitude;

    public Event() {
    }

    public Event(String name, String description, String isLocation, String latitude, String longitude) {
        this.name = name;
        this.description = description;
        this.isLocation = isLocation;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsLocation() {
        return isLocation;
    }

    public void setIsLocation(String isLocation) {
        this.isLocation = isLocation;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
