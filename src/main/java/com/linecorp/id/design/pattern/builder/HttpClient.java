package com.linecorp.id.design.pattern.builder;

public class HttpClient {
    private final int connectTimeout;
    private final int writeTimeout;
    private final int readTimeout;
    private final int retryCount;

    public HttpClient(
            int connectTimeout,
            int writeTimeout,
            int readTimeout,
            int retryCount
    ) {
        this.connectTimeout = connectTimeout;
        this.writeTimeout = writeTimeout;
        this.readTimeout = readTimeout;
        this.retryCount = retryCount;
    }

    @Override
    public String toString() {
        return "{\n" +
                "  connectTimeout: " + connectTimeout + ",\n" +
                "  writeTimeout: " + writeTimeout + ",\n" +
                "  readTimeout: " + readTimeout + ",\n" +
                "  retryCount: " + retryCount + ",\n" +
                "}";
    }
}
