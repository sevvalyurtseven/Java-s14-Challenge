package com.burger.model;

import com.burger.enums.BreadRollType;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private BreadRollType breadRollType;
    private Addition[] additions; //dinamik hale geldi

    public Hamburger(String name, String meat, double price, BreadRollType breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        this.additions = new Addition[4];
    }
}
