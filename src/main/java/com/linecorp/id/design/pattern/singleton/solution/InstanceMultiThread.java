package com.linecorp.id.design.pattern.singleton.solution;

public class InstanceMultiThread {

    private static InstanceMultiThread instance;

    private InstanceMultiThread() {
    }

    public static InstanceMultiThread getInstance() {
        if (instance == null) {
            synchronized (InstanceMultiThread.class) {
                if (instance == null) {
                    instance = new InstanceMultiThread();
                }
            }
        }

        return instance;
    }
}
