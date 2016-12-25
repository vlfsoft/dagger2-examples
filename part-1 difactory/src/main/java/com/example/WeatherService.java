package com.example;

import vlfsoft.common.annotations.di.DiFactory;

@DiFactory(factoryClassName = "AppFactory")
public class WeatherService {

    private Logger logger;

    private WebSocket socket;

    public WeatherService() {
        logger = AppFactoryA.getInstance().ofLogger();
        socket = AppFactoryA.getInstance().ofWebSocket();
    }
}
