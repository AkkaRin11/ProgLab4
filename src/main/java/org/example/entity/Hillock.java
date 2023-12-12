package org.example.entity;

public class Hillock extends Entity{

    public void stickOut(){
        System.out.print(" бугорок торчит");
    }

    public void move(){
        System.out.print(" бугорок шевелится");
    }

    @Override
    public String toString() {
        return "бугорок";
    }

    @Override
    public int hashCode() {
        int result = this == null ? 0 : this.toString().hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        return !((o == null || getClass() != o.getClass()));
    }
}
