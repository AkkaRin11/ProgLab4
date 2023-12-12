package org.example.entity;

import org.example.Data.Emotion;

import static org.example.Data.Emotion.*;

public class SnorkMaiden extends Character{
    private Emotion emotion;

    public void perched(String loc){
        System.out.print(" Фрёкен Снорк примостилась " + loc);
    }

    public void toAdmire(String what){

        int k = (int) (Math.random() * 2);

        switch (k){
            case 0 -> emotion = HAPPY;
            case 1 -> emotion = SAD;
            case 2 -> emotion = PLEASURE;
        }

        switch (emotion){
            case HAPPY -> System.out.print(" любовалась " + what);
            case SAD -> System.out.print(" с ненавестью рассматривала " + what);
            case PLEASURE -> System.out.print(" спокойно смотрела на " + what);
        }
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
            case PLEASURE -> {
                this.emotion = emotion;
                System.out.print(" Фрёкен Снорк была удовлетворена");
            }

            case SAD -> {
                this.emotion = emotion;
                System.out.print(" Фрёкен Снорк было грустно");
            }
            case HAPPY -> {
                this.emotion = emotion;
                System.out.print(" Фрёкен Снорк была счастлива");
            }
        }
    }
}
