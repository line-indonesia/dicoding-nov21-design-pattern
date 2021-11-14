package com.linecorp.id.design.pattern.builder;

import com.linecorp.id.design.pattern.builder.solution.BuilderSolution1;
import com.linecorp.id.design.pattern.builder.solution.BuilderSolution2;
import org.junit.jupiter.api.Test;

public class BuilderSolutionTest {

    @Test
    void testProblem1() {
        BuilderSolution1 builderSolution1 = new BuilderSolution1();
        builderSolution1.run();
    }

    @Test
    void testProblem2() {
        BuilderSolution2 builderSolution2 = new BuilderSolution2();
        builderSolution2.run();
    }
}
