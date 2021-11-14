package com.linecorp.id.design.pattern.builder.solution;

import com.linecorp.id.design.pattern.builder.HttpClient;

public class HttpClientBuilder {
    private int connectTimeout;
    private int writeTimeout;
    private int readTimeout;
    private int retryCount;

    public HttpClientBuilder() {
        connectTimeout = 30;
        writeTimeout = 30;
        readTimeout = 30;
        retryCount = 3;
    }

    public HttpClientBuilder setConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
        return this;
    }

    public HttpClientBuilder setWriteTimeout(int writeTimeout) {
        this.writeTimeout = writeTimeout;
        return this;
    }

    public HttpClientBuilder setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
        return this;
    }

    public HttpClientBuilder setRetryCount(int retryCount) {
        this.retryCount = retryCount;
        return this;
    }

    public HttpClient build() {
        return new HttpClient(connectTimeout, writeTimeout, readTimeout, retryCount);
    }
}