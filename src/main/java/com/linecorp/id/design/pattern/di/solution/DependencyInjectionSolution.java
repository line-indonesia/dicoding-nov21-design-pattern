package com.linecorp.id.design.pattern.di.solution;

public class DependencyInjectionSolution {

    private Vehicle vehicle;

    public DependencyInjectionSolution(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void getFuelType() {
        vehicle.getFuelType();
    }
}
