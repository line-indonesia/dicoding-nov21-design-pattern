package com.linecorp.id.design.pattern.builder;

class BuilderQuestion {
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
            HttpClient client1 = getMyClient();
            HttpClient client2 = getMyClient();
        }

        private HttpClient getMyClient(
            boolean isClientFast,
            boolean isConnectionGood
        ) {
            // set if client is fast, timeout is 5 seconds
            // if client is slow, timeout is 60 seconds

            // set if connection is good, retry count is 2
            // set if connection is bad, retry count is 5
            return new HttpClient();
        }
    }
}
