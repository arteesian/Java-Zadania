package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Pet;
import com.company.devices.Diesel;
import com.company.devices.Electric;
import com.company.devices.LPG;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Pet("dog", 5.0);
        dog.feed();
        dog.feed(3.0);

        LPG car1 = new LPG("a", "b", 100.0, 2000);
        Diesel car2 = new Diesel("a", "b", 100.0, 2000);
        Electric car3 = new Electric("a", "b", 100.0, 2000);

        car1.refuel();
        car2.refuel();
        car3.refuel();

    }
}
