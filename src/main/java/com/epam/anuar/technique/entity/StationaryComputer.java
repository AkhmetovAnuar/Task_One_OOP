package com.epam.anuar.technique.entity;

import java.math.BigDecimal;
import java.util.Random;

public class StationaryComputer extends Computer {

    private String monitor;
    enum monitorType {
        LED,
        LCD,
        TFT;
        public static String getRandom() {
            return "" + values()[(int) (Math.random() * values().length)];
        }
    }
    @Override
    public Computer createComputer() {
        Random random = new Random();
        String RandomMonitorType = monitorType.getRandom();
        this.setMonitor(RandomMonitorType);
        this.setTechniqueType("Stationary Computer");
        this.setWeight(random.nextInt(2) + 3);
        this.setPrice(BigDecimal.valueOf(random.nextInt(400) + 200));
        this.setDiagonal(random.nextDouble()*30+40);
        return this;
    }


    public String getMonitor() {
        return monitor;
    }

    public Computer setMonitor(String monitor) {
        this.monitor = monitor;
        return this;
    }


    @Override
    public String toString() {
        return super.toString()+
                "  Monitor Type: "+getMonitor()+
                " }";
    }

}
