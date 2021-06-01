package com.company.devices;

import java.util.Comparator;
import java.util.HashSet;

public class Application {
    public String name;
    public String version;
    public Double price;

    public static Comparator<Application> sortByName = Comparator.comparing(app -> app.name);
    public static Comparator<Application> sortByPrice = Comparator.comparingDouble(app -> app.price);

    public Application(String name, String version, Double price){
        this.name = name;
        this.version = version;
        this.price = price;
    }
}
