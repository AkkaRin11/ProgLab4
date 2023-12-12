package org.example.entity;

import org.example.Data.Emotion;
import org.example.interf.PartOfBody;

public class Mumintrollet extends Character{

    public Paw paw = new Paw();

    public void nodHead(){
        Head.nodHead();
    }

    @Override
    public void think(boolean flag) {
        if (flag){
            System.out.print(" Муми-тролль думал");
        } else {
            System.out.print(" Муми-тролль не думал");
        }
    }

    @Override
    public void think(String aboutWhat, boolean flag) {
        if (flag){
            System.out.print(" Муми-тролль думал о " + aboutWhat);
        } else {
            System.out.print(" Муми-тролль не думал о " + aboutWhat);
        }
    }

    @Override
    public void thinkPeacefully() {
        System.out.print(" Муми-тролль думал умиротворённо");
    }

    @Override
    public void thinkPeacefully(String aboutWhat) {
        System.out.print(" Муми-тролль думал умиротворённо о " + aboutWhat);
    }

    @Override
    public void experiencingEmotions(Emotion emotion) {
        switch (emotion){
            case PLEASURE -> System.out.println(" Муми-тролль был удовлетворен");
            case SAD -> System.out.println(" Муми-троллю было грустно");
            case HAPPY -> System.out.println(" Муми-тролль был счастлив");
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
            return "лапка Муми-тролля";
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

    private static class Head{
        public static void nodHead(){
            System.out.print(" Муми-толлль кивнул головой");
        }
    }

    @Override
    public String toString() {
        return "Муми-тролль";
    }

    @Override
    public int hashCode() {
        int result = "Муми-тролль".hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return true;
    }
}
