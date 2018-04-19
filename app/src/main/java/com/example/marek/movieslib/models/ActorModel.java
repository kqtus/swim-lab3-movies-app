package com.example.marek.movieslib.models;

import java.io.Serializable;

/**
 * Created by Marek on 14.04.2018.
 */

public class ActorModel implements Serializable {
    private int photo;
    private String firstName;
    private String lastName;

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ActorModel(String firstName, String lastName, int photo) {
        setFirstName(firstName);
        setLastName(lastName);
        setPhoto(photo);
    }
}
