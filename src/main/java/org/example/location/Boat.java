package org.example.location;

import org.example.Data.PartOfBoat;
import org.example.entity.Entity;

public class Boat extends Location{
    private String partOfBoat;
    private Location boatLocation;

    public void touchingBottom(String what, String with){
        System.out.print(" дно лодки с " + with + " касалось " + what);
    }

    public void printBoatLocation(){
        System.out.print(" вдоль " + boatLocation + "а");
    }

    public void setBoatLocation(Location boatLocation){
        this.boatLocation = boatLocation;
    }

    public Boat(Entity ... en){
        super(en);
    }

    public void printPartOfBoat(){
        System.out.print(" " + partOfBoat);
    }

    public String getPartOfBoat(){
        return partOfBoat;
    }

    public void sailOver(Location location){
        System.out.print(" лодка плыла как раз над " + location + "ом");
    }

    public void setPartOfBoat(PartOfBoat partOfBoat){
        switch (partOfBoat){
            case BOW -> this.partOfBoat = "на носу";
            case MIDDLE -> this.partOfBoat = "посреди";
        }
    }

    public void controlBoat(){
        persons.doSth("они", "гребли");
    }
    @Override
    public String toString() {
        return "лодка";
    }

    @Override
    public int hashCode() {
        int result = partOfBoat == null ? 0 : partOfBoat.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Boat that = (Boat) o;
        return partOfBoat == that.partOfBoat;
    }
}
