package com.epam.anuar.technique.entity;

import java.math.BigDecimal;
import java.util.Random;

public class CellPhone extends Phone {

    private int Storage;

    public int getStorage() {
        return Storage;
    }

    public Phone setStorage(int storage) {
        Storage = storage;
        return this;
    }

    @Override
    public Phone createPhone() {
        Random random = new Random();
        this.setTechniqueType("Cell Phone");
        this.setWeight(random.nextInt(50) + 100);
        this.setPrice(BigDecimal.valueOf(random.nextInt(150) + 150));
        this.setStorage(random.nextInt(31) + 1);
        return this;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Storage: " + getStorage() + "GB  }";
    }
}
