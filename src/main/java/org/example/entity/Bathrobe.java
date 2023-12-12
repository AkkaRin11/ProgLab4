package org.example.entity;

import java.util.ArrayList;

public class Bathrobe extends Entity{

    private final ArrayList<Entity> entities;

    public Bathrobe(){
        entities = new ArrayList<>();
    }

    public void cover(Entity entity){
        entities.add(entity);
        System.out.print(" " + entity + " накрыт купальным халатом");
    }

    @Override
    public String toString() {
        return "купальный халат";
    }

    @Override
    public int hashCode() {
        int result = entities == null ? 0 : entities.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        return !((o == null || getClass() != o.getClass()));
    }
}
