package com.example;

import com.example.acme.GpsSensor;

import vlfsoft.common.annotations.di.DiFactory;

@DiFactory(factoryClassName = "AppFactory",
        singleton = true)
public class GpsSensorModule {

    public GpsSensorModule() {
    }

    GpsSensor provideGpsSensor() {
        GpsSensor gps = new GpsSensor();
        gps.calibrate();
        return gps;
    }

}
