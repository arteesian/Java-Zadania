package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Pet;
import com.company.devices.Diesel;
import com.company.devices.Electric;
import com.company.devices.LPG;

public class Main {
    public static void main(String[] args) throws Exception {
        Human bro = new Human("John" ,"Scott", 3);
        Human me = new Human("Stan" ,"Scott", 3);
        LPG car = new LPG("a", "b", 100.0, 2005);
        bro.cash = 0.0;
        bro.setSalary(200.0);
        me.cash = 5000.0;
        me.setSalary(0.0);
        System.out.println(car.isAnyOwner());
        car.showHowManyTransactions();

        bro.setCar(car);
        System.out.println(car.isAnyOwner());
        car.ifWasSold(bro, me);

        car.sell(bro, me, 3000.0);
        System.out.println(car.isAnyOwner());
        car.ifWasSold(bro, me);

        car.sell(me, bro, 0.0);
        car.ifWasSold(me, bro);

        car.showOwnerList();
        car.showHowManyTransactions();

    }
}
