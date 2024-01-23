package com.burger.model;

import com.burger.enums.BreadRollType;

public class Hamburger implements Addable{
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

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public BreadRollType getBreadRollType() {
        return breadRollType;
    }

    public Addition[] getAdditions() {
        return additions;
    }

    @Override
    public void addAddition(String name, double price) {
        for(int i = 0; i < additions.length; i++){
            if(additions[i] == null){
                additions[i] = new Addition(name, price);
                break;
            }
        }

    }
}
