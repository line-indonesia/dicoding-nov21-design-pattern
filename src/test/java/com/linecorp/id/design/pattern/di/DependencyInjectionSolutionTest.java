package com.linecorp.id.design.pattern.di;

import com.linecorp.id.design.pattern.di.solution.DependencyInjectionSolution;

import org.junit.jupiter.api.Test;

class DependencyInjectionSolutionTest {

    @Test
    public void dependencyInjectionTest() {
        DependencyInjectionSolution dependencyInjectionSolution = new DependencyInjectionSolution();
        dependencyInjectionSolution.run();
    }
}
