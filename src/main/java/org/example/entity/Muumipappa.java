package org.example.entity;

import org.example.Data.Emotion;
import org.example.interf.PartOfBody;

import static org.example.Data.Emotion.*;

public class Muumipappa extends Character{

    private Paw paw;

    public Muumipappa(){
        paw = new Paw();
    }

    public void row(String how){
        System.out.print(" Муми-папа грёб " + how);
    }

    @Override
    public void think(boolean flag) {
        if (flag){
            System.out.print(" Муми-папа думал");
        } else {
            System.out.print(" Муми-папа не думал");
        }
    }

    @Override
    public void think(String aboutWhat, boolean flag) {
        if (flag){
            System.out.print(" Муми-папа думал о " + aboutWhat);
        } else {
            System.out.print(" Муми-папа не думал о " + aboutWhat);
        }
    }

    @Override
    public void thinkPeacefully() {
        System.out.print(" Муми-папа думал умиротворённо");
    }

    @Override
    public void thinkPeacefully(String aboutWhat) {
        System.out.print(" Муми-папа думал умиротворённо о " + aboutWhat);
    }

    @Override
    public String toString() {
        return "Муми-папа";
    }

    public void touch(Entity entity) {
        paw.touch(entity);
    }

    public void touchCarefully(Entity entity) {
        paw.touchCarefully(entity);
    }

    public void touchNoMention(String appeal) {
        paw.touchNoMention(appeal);
    }

    public void touchCarefullyNoMention(String appeal) {
        paw.touchCarefullyNoMention(appeal);
    }

    @Override
    public void experiencingEmotions(Emotion emotion) {
        switch (emotion){
            case PLEASURE -> System.out.println(" Муми-папа был удовлетворен");
            case SAD -> System.out.println(" Муми-папе было грустно");
            case HAPPY -> System.out.println(" Муми-папа был счастлив");
        }

    }

    private class Paw implements PartOfBody {
        @Override
        public void touch(Entity entity){
            System.out.print(" Муми-папа конснулся " + entity + " лапкой");
        }

        @Override
        public void touchCarefully(Entity entity){
            System.out.print(" Муми-папа осторожно конснулся " + entity + " лапкой");
        }

        @Override
        public void touchNoMention(String appeal){
            System.out.print(" Муми-папа коснулся " + appeal + " лапкой");
        }

        @Override
        public void touchCarefullyNoMention(String appeal){
            System.out.print(" Муми-папа осторожно конснулся " + appeal + " лапкой");
        }

        @Override
        public String toString() {
            return "лапка";
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

    @Override
    public int hashCode() {
        int result = paw == null ? 0 : paw.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Muumipappa that = (Muumipappa) o;
        return paw == that.paw;
    }
}
