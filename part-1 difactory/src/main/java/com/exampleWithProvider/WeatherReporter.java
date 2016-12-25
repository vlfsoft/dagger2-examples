package com.exampleWithProvider;

public class WeatherReporter {

    private final WeatherService weatherService;

    private final LocationManager locationManager;

    public WeatherReporter(WeatherService weatherService, LocationManager locationManager) {
        this.weatherService = weatherService;
        this.locationManager = locationManager;
    }

    public void report() {
        // locationManager.getCurrentLocation()
        // weatherService.getConditionsAt(currentLocation)
        System.out.println("Mostly clouded, 26 C\n");
    }
}
