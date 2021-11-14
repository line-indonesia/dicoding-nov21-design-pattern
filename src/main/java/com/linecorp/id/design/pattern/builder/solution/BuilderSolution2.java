package com.linecorp.id.design.pattern.builder.solution;

import com.linecorp.id.design.pattern.builder.HttpClient;

public class BuilderSolution2 {
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
        HttpClientBuilder builder = new HttpClientBuilder();
        // set if client is fast, timeout is 5 seconds
        // if client is slow, timeout is 60 seconds
        if (isClientFast) {
            builder.setConnectTimeout(5)
                    .setWriteTimeout(5)
                    .setReadTimeout(5);
        } else {
            builder.setConnectTimeout(60)
                    .setWriteTimeout(60)
                    .setReadTimeout(60);
        }
        // set if connection is good, retry count is 2
        // set if connection is bad, retry count is 5
        if (isConnectionGood) {
            builder.setRetryCount(2);
        } else {
            builder.setRetryCount(5);
        }
        return builder.build();
    }
}