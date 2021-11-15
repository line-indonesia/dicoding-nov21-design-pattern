package com.linecorp.id.design.pattern.builder.problem;

import com.linecorp.id.design.pattern.builder.HttpClient;

public class BuilderProblem1 {
    public void run() {
        // suppose we want to set default value for:
        // - all timeout is 30 seconds
        // - retry count is 3
        // how to set default value for HttpClient?
        HttpClient client = new HttpClient(30, 30, 30, 3);
        System.out.println(client);
    }
}
