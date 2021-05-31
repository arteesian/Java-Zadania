package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {
    public static void main(String[] args) {
        Human me = new Human();
        Human bro = new Human();
        Animal dog = new Animal("dog", 5.0);

        me.cash = 5000.0;
        bro.cash = 0.0;
        System.out.println(me.cash);

        bro.pet = dog;
        dog.sell(bro, me, 3000.0);
        System.out.println(me.cash);
        System.out.println(me.pet);

    }
}
