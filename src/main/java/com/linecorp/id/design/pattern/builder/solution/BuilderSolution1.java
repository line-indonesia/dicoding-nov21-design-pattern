package com.linecorp.id.design.pattern.builder.solution;

import com.linecorp.id.design.pattern.builder.HttpClient;

public class BuilderSolution1 {
    public void run() {
        // suppose we want to set default value for:
        // - all timeout is 30 seconds
        // - retry count is 3
        // how to set default value for HttpClient?
        HttpClient client = new HttpClientBuilder().build();
        System.out.println(client);
    }
}
