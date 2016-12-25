package com.exampleWithProvider;

public class Application {
    public static void main(String args[]) {

        AppFactoryA.inject(new AppFactory());
        WeatherReporter reporter = AppFactoryA.getInstance().ofWeatherReporterProvider().getWeatherReporter();
        reporter.report();
    }
}
