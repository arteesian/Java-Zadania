package com.company.devices;

import java.util.logging.ConsoleHandler;

public class Electric extends Car{
    public Electric(String producer, String model, Double value, Integer yearOfProduction) {
        super(producer, model, value, yearOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println("The battery got charged");
    }
}
