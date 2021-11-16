package com.linecorp.id.design.pattern.singleton;

import com.linecorp.id.design.pattern.singleton.solution.SingletonSolution1;
import com.linecorp.id.design.pattern.singleton.solution.SingletonSolution2;

import org.junit.jupiter.api.Test;

class SingletonSolutionTest {

    @Test
    void singletonSingleThreadTest() {
        System.out.println("singleton single thread");
        new SingletonSolution1().run();
    }

    @Test
    void singletonMultiThreadTest() {
        System.out.println("singleton multi thread");
        new SingletonSolution2().run();
    }
}
