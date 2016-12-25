package com.example;

import vlfsoft.common.annotations.di.DiFactory;

//@DiFactory(factoryClassName = "AppFactory")
public class LocationManager {

    private final Logger logger;

    private final GPSProvider gpsProvider;

    @DiFactory.Inject
    public LocationManager(Logger logger, GPSProvider gpsProvider) {
        this.logger = logger;
        this.gpsProvider = gpsProvider;
    }
}
