package com.example.alasif.testoopconcept;


import java.util.ArrayList;

public class Poet {

    private String name, description;
    ArrayList <Poet> poets;

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

    public Poet(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Poet() {
    }

    @Override
    public String toString() {
        return name;
    }

    public ArrayList<Poet> getAllPoet(){

        poets = new ArrayList<>();

        poets.add(new Poet("kazi", "national "));
        poets.add(new Poet("michel", "patriot "));
        poets.add(new Poet("thakur", "novel winner "));

        return poets;
    }

}
