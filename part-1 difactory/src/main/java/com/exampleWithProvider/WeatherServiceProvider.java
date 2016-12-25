package com.exampleWithProvider;

import vlfsoft.common.annotations.di.DiFactory;

@DiFactory(factoryClassName = "AppFactory", singleton = true)
public class WeatherServiceProvider {

    public Logger getLogger() {
        return new Logger();
    }

    public WebSocket getSocket() {
        return new WebSocket();
    }

    public WeatherService getWeatherService() {
        return new WeatherService(getLogger(), getSocket());
    }

    private WeatherService weatherServiceSinglton = getWeatherService();
    public WeatherService getWeatherServiceSinglton() {
        return weatherServiceSinglton;
    }

}
