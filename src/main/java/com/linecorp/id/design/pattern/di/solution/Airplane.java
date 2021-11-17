package com.linecorp.id.design.pattern.di.solution;

public class Airplane implements Vehicle {

    @Override
    public void getFuelType() {
        System.out.println("Airplane fuel type: avtur");
    }
}
