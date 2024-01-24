package com.burger.model;

import com.burger.enums.CipsType;

public class Cips {
    private CipsType cipsType;

    public Cips(CipsType cipsType) {
        this.cipsType = cipsType;
    }

    public CipsType getCipsType() {
        return cipsType;
    }
}
