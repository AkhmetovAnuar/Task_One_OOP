package com.epam.anuar.technique.entity;

public class PhoneFactory {

    enum PhoneType {
        CELL_PHONE,
        HOME_PHONE;

        public static String getRandom() {
            return "" + values()[(int) (Math.random() * values().length)];
        }
    }

    public Phone createRandomPhone() {
        String RandomPhoneType = PhoneType.getRandom();
        if (RandomPhoneType.equals("CELL_PHONE")) {
            return new CellPhone().createPhone();
        }
        if (RandomPhoneType.equals("HOME_PHONE")) {
            return new StationaryPhone().createPhone();
        }
        return null;

    }
}
