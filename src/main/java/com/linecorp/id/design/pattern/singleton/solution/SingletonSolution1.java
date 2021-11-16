package com.linecorp.id.design.pattern.singleton.solution;

public class SingletonSolution1 {
    public void run() {
        InstanceSingleThread instance1 = InstanceSingleThread.getInstance();
        InstanceSingleThread instance2 = InstanceSingleThread.getInstance();
        System.out.println("Instance 1: "+instance1.hashCode());
        System.out.println("Instance 2: "+instance2.hashCode());
    }
}
