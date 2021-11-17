package com.linecorp.id.design.pattern.di.solution;

public class Car implements Vehicle {

    @Override
    public void getFuelType() {
        System.out.println("Car fuel type: electricity");
    }
}
