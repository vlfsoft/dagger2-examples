package com.example;

import vlfsoft.common.annotations.di.DiFactory;

@DiFactory(factoryClassName = "AppFactory")
public class WeatherReporter {

    private final WeatherService weatherService;

    private final LocationManager locationManager;

    public WeatherReporter() {
        this.weatherService = AppFactoryA.getInstance().ofWeatherService();
        this.locationManager = AppFactoryA.getInstance().ofLocationManager();
    }

    public void report() {
        // locationManager.getCurrentLocation()
        // weatherService.getConditionsAt(currentLocation)
        System.out.println("Mostly clouded, 26 C\n");
    }
}
