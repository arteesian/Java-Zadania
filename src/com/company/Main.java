package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Pet;
import com.company.devices.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Human me = new Human("Stan" ,"Scott", 3);
        me.cash = 500.0;
        Phone phone = new Phone("Xiaomi", "Redmi 8T", 6.2, "Android", 2019);
        me.phone = phone;
        phone.human = me;

        Application app1 = new Application("Angry Birds", "1.0", 30.0);
        Application app2 = new Application("Camera", "3.5", 0.0);
        Application app3 = new Application("Facebook", "2.8.12", 0.0);
        Application app4 = new Application("Tetris", "2.4", 15.0);
        Application app5 = new Application("Chess", "11.5", 50.0);

        me.phone.installApplication(app1);
        me.phone.installApplication(app2);
        me.phone.installApplication(app3);
        me.phone.installApplication(app4);
        me.phone.installApplication(app5);

        System.out.println(me.phone.isInstalled(app3));
        System.out.println(me.phone.isInstalled("Angry Birds"));
        System.out.println(me.phone.isInstalled("Candy Crush"));
        System.out.println(me.phone.isInstalled("Facebook"));
        System.out.println(me.phone.isInstalled("Instagram"));

        me.phone.showFreeApps();

        me.phone.showAppsPrice();

        me.phone.sortByName();
        me.phone.sortByPrice();




    }
}
