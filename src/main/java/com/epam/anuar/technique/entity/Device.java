package com.epam.anuar.technique.entity;

import java.math.BigDecimal;

public class Device implements Comparable {

    private int weight;
    private BigDecimal price;
    private String techniqueType;


    //Setter and Getters;
    public String getTechniqueType() {
        return techniqueType;
    }

    public Device setTechniqueType(String techniqueType) {
        this.techniqueType = techniqueType;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Device setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public int getWeight() {
        return weight;
    }

    public Device setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public String toString() {
        return getTechniqueType() + " { " +
                " Weight: " + getWeight() + "kg" +
                " Price: " + getPrice() + "$ ";
    }

    /*
    *@return one integer amount -1,0,1
    * to compare prices, which have type BigDecimal
    * we need overrode compareTo() method of BigDecimal
    * if current price bigger than parameter's, it'll return -1
    *                  smaller return 1
    *                  they are equal return 0;
    */
    @Override
    public int compareTo(Object o) {
        Device tmp = (Device) o;
        return  this.getPrice().compareTo( tmp.getPrice());
       }

}
