package com.epam.anuar.technique.entity;

public class ComputerFactory {

    enum ComputerType {
        STATIONARY_COMPUTER,
        NOTEBOOK;

        public static String getRandom() {
            return "" + values()[(int) (Math.random() * values().length)];
        }
    }

    public Computer createRandomPhone() {
        String RandomPhoneType = ComputerType.getRandom();
        if (RandomPhoneType.equals("STATIONARY_COMPUTER")) {
            return new StationaryComputer().createComputer();
        }
        if (RandomPhoneType.equals("NOTEBOOK")) {
            return new NoteBook().createComputer();
        }
        return null;
    }
}
