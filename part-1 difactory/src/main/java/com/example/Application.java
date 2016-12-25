package com.example;

import vlfsoft.common.annotations.di.DiFactory;

interface App {

    @DiFactory
    void get(GPSProvider a);

    @DiFactory
    void get(LocationManager a);

}

public class Application {
    public static void main(String args[]) {

        AppFactoryA.inject(new AppFactory());
        WeatherReporter reporter = AppFactoryA.getInstance().ofWeatherReporter();
        reporter.report();
    }
}
