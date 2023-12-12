package org.example.location;

public class Strait extends Location{

    public void lead(Location location){
        System.out.print(" пролив вёл к " + location);
    }

    @Override
    public String toString() {
        return "пролив";
    }

    @Override
    public int hashCode() {
        int result = "пролив".hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return true;
    }
}
