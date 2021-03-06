package com.linecorp.id.design.pattern.singleton.solution;

public final class InstanceSingleThread {

    private static InstanceSingleThread instance;

    private InstanceSingleThread() {
    }

    public static InstanceSingleThread getInstance() {
        if (instance == null) {
            instance = new InstanceSingleThread();
        }

        return instance;
    }
}
