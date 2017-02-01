package com.example.model;

import javax.persistence.Entity;

/**
 * Created by sscutaru on 1/26/2017.
 */

@Entity
public class Habit {

    private int id;
    private String name;
    private String description;


    public Habit(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Habit(){}


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


}
