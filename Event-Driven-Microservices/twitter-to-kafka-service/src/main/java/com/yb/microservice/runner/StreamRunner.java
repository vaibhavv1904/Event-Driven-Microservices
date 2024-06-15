package com.yb.microservice.runner;

import twitter4j.TwitterException;
public interface StreamRunner {
    void start() throws TwitterException;
}
