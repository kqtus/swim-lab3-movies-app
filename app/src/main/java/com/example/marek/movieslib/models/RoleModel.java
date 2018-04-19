package com.example.marek.movieslib.models;

import java.io.Serializable;

/**
 * Created by Marek on 14.04.2018.
 */

public class RoleModel implements Serializable {
    private ActorModel actor;
    private String name;

    public ActorModel getActor() {
        return actor;
    }

    public void setActor(ActorModel actorModel) {
        this.actor = actorModel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RoleModel(ActorModel actor, String name) {
        setActor(actor);
        setName(name);
    }
}
