package org.example.location;

public class DesertMountains extends Location{

    public Rock rock;

    public DesertMountains(){
        rock = new Rock();
    }


    public class Rock{
        public String protectSth(Location location){
            return " скалу охраняющую " + location;
        }

        @Override
        public String toString() {
            return "скала";
        }
    }

    @Override
    public String toString() {
        return "пустынной горе";
    }

    @Override
    public int hashCode() {
        int result = "пустынная гора".hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return true;
    }
}
