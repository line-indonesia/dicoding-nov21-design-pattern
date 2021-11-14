package com.linecorp.id.design.pattern.builder;

class BuilderSolution {
    class HttpClient {
        private int connectTimeout;
        private int writeTimeout;
        private int readTimeout;
        private int retryCount;

        public HttpClient(
            int connectTimeout,
            int writeTimeout,
            int readTimeout,
            int retryCount,
        ) {
            this.connectTimeout = connectTimeout;
            this.writeTimeout = writeTimeout;
            this.readTimeout = readTimeout;
            this.retryCount = retryCount;
        }
    }

    class HttpClientBuilder {
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
            return HttpClient(connectTimeout, writeTimeout, readTimeout, retryCount)
        }
    }

    class BuilderProblem1 {
        public void run() {
            // suppose we want to set default value for:
            // - all timeout is 30 seconds
            // - retry count is 3
            // how to set default value for HttpClient?
            HttpClient client = new HttpClient();
        }
    }

    class BuilderProblem2 {
        public void run() {
            HttpClient client1 = getMyClient(false , false);
            HttpClient client2 = getMyClient(true, false);
            HttpClient client3 = getMyClient(false, true);
            HttpClient client4 = getMyClient(true, true);
        }

        private HttpClient getMyClient(
            boolean isClientFast,
            boolean isConnectionGood
        ) {
            HttpClientBuilder builder = new HttpClientBuilder()
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
}
