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

    public Addition getHealthyAddition2() {
        return healthyAddition2;
    }

    @Override
    public void addAddition(String name, double price) {
        if(healthyAddition1 == null){
            healthyAddition1 = new Addition(name, price);
            setPrice(getPrice() + getHealthyAddition1().getPrice());
        }
        else if (healthyAddition2 == null){
            healthyAddition2 = new Addition(name, price);
            setPrice(getPrice() + getHealthyAddition2().getPrice());
        }
        else {
            System.out.println("Ekstra malzeme 2 taneden fazla olamaz!");
        }
    }

    @Override
    public void itemizeHamburger() {
        StringBuilder builder = new StringBuilder();
        if(healthyAddition1 != null){
            builder.append("HealthyAddition1: " + getHealthyAddition1().getName() + "\n");
            builder.append("HealthyAddition1 Price: " + getHealthyAddition1().getPrice() + "\n");
        }
        if(healthyAddition2 != null){
            builder.append("HealthyAddition2: " + getHealthyAddition2().getName() + "\n");
            builder.append("HealthyAddition1 Price: " + getHealthyAddition2().getPrice() + "\n");
        }
        System.out.println(builder);
        super.itemizeHamburger();
    }
}
