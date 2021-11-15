package com.linecorp.id.design.pattern.builder.problem;

import com.linecorp.id.design.pattern.builder.HttpClient;
import com.linecorp.id.design.pattern.builder.solution.HttpClientBuilder;

public class BuilderProblem2 {
    public void run() {
        HttpClient client1 = getMyClient(false , false);
        HttpClient client2 = getMyClient(true, false);
        HttpClient client3 = getMyClient(false, true);
        HttpClient client4 = getMyClient(true, true);
        System.out.println(client1);
        System.out.println(client2);
        System.out.println(client3);
        System.out.println(client4);
    }

    private HttpClient getMyClient(
            boolean isClientFast,
            boolean isConnectionGood
    ) {
        return new HttpClient(30, 30, 30, 3);
    }
}
