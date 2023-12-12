package org.example;

import org.example.Data.PartOfBoat;
import org.example.entity.*;
import org.example.exceptions.MentalException;
import org.example.exceptions.PawException;
import org.example.interf.PartOfBody;
import org.example.location.*;

public class Main {
    public static void main(String[] args) {
        Boat boat = new Boat();
        boat.setPartOfBoat(PartOfBoat.BOW);
        Muumimamma muumimamma = new Muumimamma();
        muumimamma.recognize("знакомые места", true);
        addDot();
        boat.controlBoat();
        Strait strait = new Strait();
        boat.setBoatLocation(strait);
        boat.printBoatLocation();
        DesertMountains desertMountains = new DesertMountains();
        addComa();
        strait.lead(desertMountains);
        addDot();
        addEndl();
        EntranceValleyOfMoomins entranceValleyOfMoomins = new EntranceValleyOfMoomins();
        muumimamma.toKnow("за следующим поворотом они увидят",
                desertMountains.rock.protectSth(entranceValleyOfMoomins));
        addDot();
        addEndl();
        SnorkMaiden snorkMaiden = new SnorkMaiden();
        boat.addNewEntity(snorkMaiden);
        snorkMaiden.perched(boat.getPartOfBoat() + " лодки");
        addAnd();
        snorkMaiden.toAdmire("подводным миром");
        addDot();
        UnderwaterMeadow underwaterMeadow = new UnderwaterMeadow();
        boat.sailOver(underwaterMeadow);
        addComa();
        addAnd();
        Flowers flowers = new Flowers();
        underwaterMeadow.addNewEntity(flowers);
        try {
            boat.touchingBottom(underwaterMeadow.getListObj().get(0), "шуршанием");
        } catch (MentalException e) {
            System.out.print(e);
        }
        addDot();
        addEndl();
        flowers.printSpecifications();
        flowers.lookThrough("тольщу воды");
        addAnd();
        flowers.pullStemsTowardsSun();
        addDot();
        addEndl();
        Muumipappa muumipappa = new Muumipappa();
        muumipappa.row("длинными, сильными гребками");
        addDot();

        boat.setPartOfBoat(PartOfBoat.MIDDLE);
        Hillock hillock = new Hillock();
        Bathrobe bathrobe = new Bathrobe();
        boat.printPartOfBoat();
        boat.addNewEntity(hillock, bathrobe);
        hillock.printLocation();
        hillock.stickOut();
        addComa();
        bathrobe.cover(hillock);
        addDot();
        hillock.move();
        addDot();
        addEndl();
        muumipappa.touchCarefullyNoMention("его");
        addDot();
        addBut();
        Hemuli hemuli = new Hemuli();
        hemuli.printCharacteristic();
        hemuli.think("вязать", false);
        addDot();
        addEndl();
        Copybook copybook = new Copybook();
        hemuli.write("Запрещается", copybook, 5000, "упорно", false);
        addDot();
        addEndl();
        hemuli.fill(copybook.page, "такими словами", 5000);
        hemuli.thinkPeacefully("Все-таки чудесно быть доброй");
        addDot();

        Mumintrollet mumintrollet = new Mumintrollet();
        try {
            muumimamma.shakePaw(mumintrollet.paw);
        } catch (PawException e) {
            System.out.print(e);
        }
        addDot();
        addEndl();
        mumintrollet.nodHead();
        addDot();
        muumimamma.toLaugh();
        addDot();
    }


    public static void addComa(){
        System.out.print(",");
    }

    public static void addDot(){
        System.out.print(".");
    }

    public static void addEndl(){
        System.out.println();
    }

    public static void addBut(){
        System.out.print(" но");
    }

    public static void addAnd(){
        System.out.print(" и");
    }
}