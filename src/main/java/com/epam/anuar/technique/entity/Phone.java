package com.epam.anuar.technique.entity;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Random;

public abstract class Phone extends Device {

    public abstract Phone createPhone();

    public String toString() {
        return getTechniqueType() + " { "+
                " Weight: " + getWeight() + "g" +
                " Price: " + getPrice() + "$ ";
    }

}
