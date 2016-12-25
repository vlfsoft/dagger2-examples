package com.example;

import vlfsoft.common.annotations.di.DiFactory;

@DiFactory(factoryClassName = "AppFactory",
        abstractionClassSuffix = "A",
        implementationClassSuffix = "-")
abstract public class WeatherServiceA {

    public WeatherServiceA() {
    }

}
