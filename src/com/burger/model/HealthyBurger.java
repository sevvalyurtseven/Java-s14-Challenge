package com.burger.model;

import com.burger.enums.BreadRollType;

public class HealthyBurger extends Hamburger{
    private Addition healthyAddition1;
    private Addition healthyAddition2;

    public HealthyBurger(String name, double price, BreadRollType breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }

    public Addition getHealthyAddition1() {
        return healthyAddition1;
    }

    public Addition getGetHealthyAddition2() {
        return healthyAddition2;
    }

    @Override
    public void addAddition(String name, double price) {
        if(healthyAddition1 == null){
            healthyAddition1 = new Addition(name, price);
        }
        else if (healthyAddition2 == null){
            healthyAddition2 = new Addition(name, price);
        }
    }
}
