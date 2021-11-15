package com.linecorp.id.design.pattern.factory;

import com.linecorp.id.design.pattern.factory.solution.FactorySolution;
import org.junit.jupiter.api.Test;

public class FactorySolutionTest {

    @Test
    void factorySolutionTest() {
        FactorySolution solution = new FactorySolution();
        solution.run();
    }
}
