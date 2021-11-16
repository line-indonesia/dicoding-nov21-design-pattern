package com.linecorp.id.design.pattern.singleton.solution;

public class SingletonSolution2 {
    public void run() {
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                super.run();
                InstanceMultiThread instance1 = InstanceMultiThread.getInstance();
                System.out.println("Instance 1: "+instance1.hashCode());
            }
        };

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                super.run();
                InstanceMultiThread instance2 = InstanceMultiThread.getInstance();
                System.out.println("Instance 2: "+instance2.hashCode());
            }
        };

        thread1.start();
        thread2.start();
    }
}
