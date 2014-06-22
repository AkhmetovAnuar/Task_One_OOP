package com.epam.anuar.technique.entity;

public class TechniqueBuilder {

    public Technique Build(){
        Technique technique= new Technique();
        technique.addDevice(new PhoneFactory().createRandomPhone());
        technique.addDevice(new PhoneFactory().createRandomPhone());
        technique.addDevice(new ComputerFactory().createRandomPhone());
        technique.addDevice(new ComputerFactory().createRandomPhone());

        return technique;
    }

}
