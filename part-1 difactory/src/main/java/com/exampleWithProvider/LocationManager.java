package com.exampleWithProvider;

public class LocationManager {

    private final Logger logger;

    private final GPSProvider gpsProvider;

    public LocationManager(Logger logger, GPSProvider gpsProvider) {
        this.logger = logger;
        this.gpsProvider = gpsProvider;
    }
}
