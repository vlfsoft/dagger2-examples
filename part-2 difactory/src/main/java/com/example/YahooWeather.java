package com.example;

public class YahooWeather extends WeatherServiceA {

    private WebSocket socket;

    private String key;

    public YahooWeather(String key) {
        socket = AppFactoryA.getInstance().ofWebSocket();
        this.key = key;
    }

}
