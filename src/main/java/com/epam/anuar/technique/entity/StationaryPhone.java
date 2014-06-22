package com.epam.anuar.technique.entity;

import javafx.scene.control.Cell;

import java.math.BigDecimal;
import java.util.Random;

public class StationaryPhone extends Phone {

    private int handsetCord;

    public Phone setHandsetCord(int handsetCord) {
        this.handsetCord = handsetCord;
        return this;
    }

    public int getHandsetCord() {
        return handsetCord;
    }


    @Override
    public Phone createPhone() {
        Random random = new Random();
        this.setTechniqueType("Stationary Phone ");
        this.setWeight(random.nextInt(50) + 100);
        this.setPrice(BigDecimal.valueOf(random.nextInt(150) + 150));
        this.setHandsetCord(random.nextInt(3)+1);
        return this;
    }

    @Override
    public String toString() {
        return super.toString()+
                " Handset Cord: "+getHandsetCord()+"m }";
    }

}
