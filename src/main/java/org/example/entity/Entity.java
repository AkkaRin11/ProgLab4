package org.example.entity;

import org.example.location.Location;

public abstract class Entity {
    private Location location;

    public void addToLocation(Location location){
        this.location = location;
    }

    public void printLocation(){
        System.out.print(" " + location);
    }
}
