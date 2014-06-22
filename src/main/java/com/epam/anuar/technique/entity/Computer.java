package com.epam.anuar.technique.entity;

import java.math.BigDecimal;

public abstract class Computer extends Device {

    private double diagonal;

    public abstract Computer createComputer();

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;

    }

    @Override
    public String toString() {
        return super.toString() +
                " Diagonal: " + String.format("%.1f",getDiagonal())+"cm";
    }
}

