package com.exampleWithProvider;

import vlfsoft.common.annotations.di.DiFactory;

@DiFactory(factoryClassName = "AppFactory", singleton = true)
public class LocationManagerProvider {

    public Logger getLogger() {
        return new Logger();
    }

    public GPSProvider getGpsProvider() {
        return new GPSProvider();
    }

    public LocationManager getLocationManager() {
        return new LocationManager(getLogger(), getGpsProvider());
    }
}
