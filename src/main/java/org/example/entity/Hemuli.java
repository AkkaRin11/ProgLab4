package org.example.entity;

import org.example.Data.Emotion;

public class Hemuli extends Character{

    private final String characteristic;

    {
        characteristic = "маленькая";
    }

    public void printCharacteristic(){
        System.out.print(" " + characteristic);
    }

    @Override
    public void think(boolean flag) {
        if (flag){
            System.out.print(" Хемулиха думала");
        } else {
            System.out.print(" Хемулиха не думала");
        }
    }

    @Override
    public void think(String aboutWhat, boolean flag) {
        if (flag){
            System.out.print(" Хемулиха думала " + aboutWhat);
        } else {
            System.out.print(" Хемулиха не думала " + aboutWhat);
        }
    }

    @Override
    public void thinkPeacefully() {
        System.out.print(" Хемулиха думала умиротворённо");
    }

    @Override
    public void thinkPeacefully(String aboutWhat) {
        System.out.print(" \"" + aboutWhat + "\" - думала Хемулиха умиротворенно");
    }

    @Override
    public String toString() {
        return "Хемулиха";
    }

    public void write(String what, Entity where, int quantity){
        System.out.print(" Хемулиха писала в " + where + " " + what + " " + quantity + " раз");
    }

    public void write(String what, Entity where, int quantity, String how, boolean start){
        if (start) {
            System.out.print(" Хемулиха начала " + how + " писать в " + where + " " + what + " " + quantity + " раз");
        } else {
            System.out.print(" Хемулиха продолжала " + how + " писать в " + where + " " + what + " " + quantity + " раз");
        }
    }

    public void fill(Entity object, String what, int quantity){
        if (quantity == 1){
            System.out.println(" Хемулиха заполняла " + object + " " + what);
        } else {
            System.out.println(" Хемулиха заполняла " + object + " за " + object + " " + what);
        }
    }

    public void fill(Entity object, String what, int quantity, Emotion emotion){
        if (quantity == 1){
            System.out.println(" Хемулиха заполняла " + object + " " + what);
        } else {
            System.out.println(" Хемулиха заполняла " + object + " за " + object + " " + what);
        }
        experiencingEmotions(emotion);
    }

    @Override
    public void experiencingEmotions(Emotion emotion) {
        if (emotion == Emotion.PLEASURE){
            System.out.println(" Хемулиха была удовлетворена");
        }
    }

    @Override
    public int hashCode() {
        int result = characteristic == null ? 0 : characteristic.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hemuli that = (Hemuli) o;

        return characteristic == that.characteristic;
    }
}
