package com.burger.model;

import com.burger.enums.BreadRollType;

public class HealthyBurger extends Hamburger{
    private Addition healthyAddition1;
    private Addition getHealthyAddition2;

    public HealthyBurger(String name, double price, BreadRollType breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }

}
