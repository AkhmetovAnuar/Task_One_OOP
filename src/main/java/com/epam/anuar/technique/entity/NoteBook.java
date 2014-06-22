package com.epam.anuar.technique.entity;

import java.math.BigDecimal;
import java.util.Random;

public class NoteBook extends Computer {

    private double camera;

    public double getCamera() {
        return camera;
    }

    public Computer setCamera(double camera) {
        this.camera = camera;
        return this;
    }

    @Override
    public Computer createComputer() {
        Random random = new Random();

        this.setTechniqueType("NoteBook");
        this.setWeight(random.nextInt(2) + 1);
        this.setPrice(BigDecimal.valueOf(random.nextInt(700) + 600));
        this.setCamera(random.nextDouble()*4+1);
        this.setDiagonal(random.nextDouble()*30+30);
        return this;
    }

    @Override
    public String toString() {
        return super.toString() +
                "  Camera: " + String.format("%.1f",getCamera()) + "mp" + " }";
    }
}
