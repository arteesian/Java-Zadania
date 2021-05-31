package com.company.devices;

import java.util.Comparator;

public class CarYearProductionComparator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2){
        if(car1.yearOfProduction < car2.yearOfProduction){
            return -1;
        } else if (car1.yearOfProduction > car2.yearOfProduction) {
            return 1;
        } else {
            return 0;
        }
    }
}
