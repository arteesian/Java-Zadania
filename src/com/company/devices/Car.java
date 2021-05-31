package com.company.devices;

import com.company.Human;
import com.company.Sellable;

public abstract class Car extends Device implements Sellable {

    public abstract void refuel();

    public Double value;

    public Car(String producer, String model, Double value, Integer yearOfProduction){
        super(producer, model, yearOfProduction);
        this.value = value;
    }

    @Override
    public void turnOn(){
        System.out.println("The car engine is on");
    }

    public String toString(){
        return "Producer: " + producer + ", model: " + model + ", value: " + value;
    }

    @Override
    public void sell (Human seller, Human buyer, Double price) throws Exception{
        if(!seller.hasCar(this))
            throw new Exception("A seller doesn't have an auto");

        if(!buyer.hasFreeParkingSlot())
            throw new Exception("A buyer doesn't have space");

        if(buyer.cash < price)
            throw new Exception("A buyer doesn't have enough cash");

        seller.removeCar(this);
        buyer.addCar(this);
        seller.cash += price;
        buyer.cash -= price;
        System.out.println("The car has got sold successfully");
    }
}
