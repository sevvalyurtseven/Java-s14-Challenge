package com.burger.model;

import com.burger.enums.DrinkType;

public class Drink {
    private DrinkType drinkType;

    public Drink(DrinkType drinkType) {
        this.drinkType = drinkType;
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }
}
