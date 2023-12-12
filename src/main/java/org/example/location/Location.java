package org.example.location;

import org.example.entity.Character;
import org.example.entity.Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;

public abstract class Location {
    protected final Persons persons;
    protected final NotLLivingObj notLLivingObj;

    public Location(Entity ... en){
        persons = new Persons();
        notLLivingObj = new NotLLivingObj();


        addNewEntity(en);
    }

    public void addNewEntity(Entity ... en){
        for(Entity entity: en) {
            if (entity instanceof Character){
                persons.addNewPerson(entity);
            } else {
                notLLivingObj.addNewObj(entity);
            }
        }
    }

    protected class NotLLivingObj{
        private final ArrayList<Entity> notLivingObj;

        private NotLLivingObj(){
            notLivingObj = new ArrayList<>();
        }

        protected List<String> getListObj(){
            List<String> ls = new ArrayList<>();

            for (Entity en : notLivingObj){
                ls.add(en.toString());
            }

            return ls;
        }

        private void addNewObj(Entity entity){
            notLivingObj.add(entity);
            entity.addToLocation(Location.this);
        }
    }

    protected class Persons{
        private final ArrayList<Entity> persons;
        private Persons(){
            persons = new ArrayList<>();
        }

        private void addNewPerson(Entity entity){
            persons.add(entity);
            entity.addToLocation(Location.this);
        }

        public void doSth(String appeal, String what){
            System.out.print(" " + appeal + " " + what);
        }
    }
}
