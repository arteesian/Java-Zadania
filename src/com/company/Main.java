package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Pet;
import com.company.devices.Diesel;
import com.company.devices.Electric;
import com.company.devices.LPG;

public class Main {
    public static void main(String[] args) throws Exception {
        Human me = new Human(3);
        Human bro = new Human(3);
        me.setSalary(5000.0);
        bro.setSalary(3000.0);
        me.cash = 5000.0;
        bro.cash = 0.0;

        LPG car1 = new LPG("a", "b", 100.0, 2000);
        Diesel car2 = new Diesel("c", "d", 500.0, 2010);
        bro.setCar(car1);
        bro.setCar(car2);
        System.out.println(bro.getCar(0));
        System.out.println(bro.getCar(1));

        car1.sell(bro, me, 500.0);

        System.out.println(me.getCar(0));

    }
}
