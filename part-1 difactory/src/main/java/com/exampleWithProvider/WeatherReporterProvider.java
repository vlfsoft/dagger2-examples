package com.exampleWithProvider;

import vlfsoft.common.annotations.di.DiFactory;

@DiFactory(factoryClassName = "AppFactory", singleton = true)
public class WeatherReporterProvider {

    public WeatherReporter getWeatherReporter() {
        return new WeatherReporter(
                AppFactoryA.getInstance().ofWeatherServiceProvider().getWeatherService(),
                AppFactoryA.getInstance().ofLocationManagerProvider().getLocationManager()
                );
    }

}
