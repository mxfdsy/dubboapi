package com.demo.dubboapi.dubbo;

public interface ExposeService {
    String getData();

    String getUserById(String id);

    String callbackDemo(String payload);
}
