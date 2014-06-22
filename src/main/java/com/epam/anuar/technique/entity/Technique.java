package com.epam.anuar.technique.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Technique {
    public ArrayList<Device> devices = new ArrayList<Device>();

    public void addDevice(Device device){
        devices.add(device);
    }

    public BigDecimal getCoast(){
        BigDecimal cost = BigDecimal.ZERO;
        for (int i = 0; i < devices.size(); i++) {
            cost = cost.add(devices.get(i).getPrice());
        }
        return cost;
    }

    public void sortByPrice(){
        Collections.sort(devices);
    }

    public void printAll() {
        for (int i = 0; i < devices.size(); i++) {
            System.out.println(devices.get(i));
        }
    }

}
