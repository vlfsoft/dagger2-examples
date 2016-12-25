package com.example;

import com.example.acme.GpsSensor;

import vlfsoft.common.annotations.di.DiFactory;

@DiFactory(factoryClassName = "AppFactory")
public class LocationManager {

    private final GpsSensor gps;

    public LocationManager() {
        this.gps = AppFactoryA.getInstance().ofGpsSensorModule().provideGpsSensor();
    }
}
