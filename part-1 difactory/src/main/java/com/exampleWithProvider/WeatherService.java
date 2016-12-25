package com.exampleWithProvider;

public class WeatherService {

    private Logger logger;

    private WebSocket socket;

    public WeatherService(Logger logger, WebSocket socket) {
        logger = logger;
        socket = socket;
    }
}
