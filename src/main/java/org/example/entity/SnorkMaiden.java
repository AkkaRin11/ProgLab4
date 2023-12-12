package org.example.entity;

import org.example.Data.Emotion;

public class SnorkMaiden extends Character{
    public void perched(String loc){
        System.out.print(" Фрёкен Снорк примостилась " + loc);
    }

    public void toAdmire(String what){
        System.out.print(" любовалась " + what);
    }

    @Override
    public void think(boolean flag) {
        if (flag){
            System.out.print(" Фрёкен Снорк думала");
        } else {
            System.out.print(" Фрёкен Снорк не думала");
        }
    }

    @Override
    public void think(String aboutWhat, boolean flag) {
        if (flag){
            System.out.print(" Фрёкен Снорк думала о " + aboutWhat);
        } else {
            System.out.print(" Фрёкен Снорк не думала о " + aboutWhat);
        }
    }

    @Override
    public void thinkPeacefully() {
        System.out.print(" Фрёкен Снорк думала умиротворённо");
    }

    @Override
    public void thinkPeacefully(String aboutWhat) {
        System.out.print(" Фрёкен Снорк думала умиротворённо о " + aboutWhat);
    }

    @Override
    public void experiencingEmotions(Emotion emotion) {
        switch (emotion){
            case PLEASURE -> System.out.print(" Фрёкен Снорк была удовлетворена");
            case SAD -> System.out.print(" Фрёкен Снорк было грустно");
            case HAPPY -> System.out.print(" Фрёкен Снорк была счастлива");
        }
    }
}
