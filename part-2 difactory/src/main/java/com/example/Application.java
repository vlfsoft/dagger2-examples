package com.example;

public class Application {
    public static void main(String args[]) {

        if(args.length < 1) {
            System.out.println("You must provide an API key\n");
            return;
        }

        String apiKey = args[0];
        AppFactoryA.inject(new AppFactoryYahooWeather(apiKey));
        WeatherReporter reporter = AppFactoryA.getInstance().ofWeatherReporter();

        // How to inject key into WeatherServiceA ?
        reporter.report();
    }

    private static class AppFactoryYahooWeather extends AppFactory {
        String key;

        public AppFactoryYahooWeather(String key) {
            this.key = key;
        }

        @Override
        public WeatherServiceA ofWeatherService() {
            return new YahooWeather(key);
        }
    }

    private static class AppFactoryWeatherChannel extends AppFactory {
        @Override
        public WeatherServiceA ofWeatherService() {
            return new WeatherChannel();
        }
    }
}
