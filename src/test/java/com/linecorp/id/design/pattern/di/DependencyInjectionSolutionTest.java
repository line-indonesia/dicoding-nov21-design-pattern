package com.linecorp.id.design.pattern.di;

import com.linecorp.id.design.pattern.di.solution.Airplane;
import com.linecorp.id.design.pattern.di.solution.Car;
import com.linecorp.id.design.pattern.di.solution.DependencyInjectionSolution;

import org.junit.jupiter.api.Test;

class DependencyInjectionSolutionTest {

    @Test
    public void carDependencyInjectionTest() {
        Car car = new Car();
        DependencyInjectionSolution dependencyInjection = new DependencyInjectionSolution(car);
        dependencyInjection.getFuelType();
    }

    @Test
    public void airplaneDependencyInjectionTest() {
        Airplane airplane = new Airplane();
        DependencyInjectionSolution dependencyInjection = new DependencyInjectionSolution(airplane);
        dependencyInjection.getFuelType();
    }
}
