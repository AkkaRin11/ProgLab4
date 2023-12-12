package org.example.entity;

import org.example.Data.Emotion;
import org.example.Data.PartOfBoat;
import org.example.exceptions.PawException;
import org.example.interf.PartOfBody;
import org.example.location.Location;

import java.util.function.Function;

import static org.example.Data.Emotion.PLEASURE;

public class Muumimamma extends Character{

    @Override
    public void think(boolean flag) {
        if (flag){
            System.out.print(" Муми-мама думала");
        } else {
            System.out.print(" Муми-мама не думала");
        }
    }

    @Override
    public void think(String aboutWhat, boolean flag) {
        if (flag){
            System.out.print(" Муми-мама думала о " + aboutWhat);
        } else {
            System.out.print(" Муми-мама не думала о " + aboutWhat);
        }
    }

    @Override
    public void thinkPeacefully() {
        System.out.print(" Муми-мама думала умиротворённо");
    }

    @Override
    public void thinkPeacefully(String aboutWhat) {
        System.out.print(" Муми-мама думала умиротворённо о " + aboutWhat);
    }

    @Override
    public void experiencingEmotions(Emotion emotion) {
        switch (emotion){
            case PLEASURE -> System.out.print(" Муми-мама была удовлетворена");
            case SAD -> System.out.print(" Муми-маме было грустно");
            case HAPPY -> System.out.print(" Муми-мама была счастлива");
        }
    }

    public void recognize(String what, boolean start){
        if (start){
            System.out.print(" Муми-мама начала узнавать " + what);
        } else {
            System.out.print(" Муми-мама узнала " + what);
        }
    }

    public void toKnow(String what, String a){
        System.out.print(" она знала, что " + what + a);
    }

    public void toLaugh(){
        System.out.print(" Муми-мама рассмеялась");
    }

    public void shakePaw(Object o) throws PawException {
        if (!(o instanceof PartOfBody)){
            throw new PawException("Это не то что можно пожать...");
        }

        System.out.print(" Муми-мама пожала " + o);
    }

    @Override
    public String toString() {
        return "Муми-мама";
    }

    @Override
    public int hashCode() {
        int result = "Муми-мама".hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return true;
    }
}
