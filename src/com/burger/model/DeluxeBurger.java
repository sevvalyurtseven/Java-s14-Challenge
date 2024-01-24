package com.burger.model;


import com.burger.enums.BreadRollType;

public class DeluxeBurger extends Hamburger {
    private Drink drink;
    private Cips cips;

    public DeluxeBurger(Drink drink, Cips cips) {
        super("DELUXE BURGER", "DOUBLE", 19.10, BreadRollType.DOUBLE_BURGER);
        this.drink = drink;
        this.cips = cips;
    }
}
