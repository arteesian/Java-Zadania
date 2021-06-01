package com.company.devices;

import com.company.Human;
import com.company.Sellable;

import java.util.ArrayList;

public abstract class Car extends Device implements Sellable {

    public Double value;
    public abstract void refuel();
    public boolean isSold;
    public int sellCounter = 0;

    public ArrayList<String> ownerlist = new ArrayList<String>();

    public Car(String producer, String model, Double value, Integer yearOfProduction){
        super(producer, model, yearOfProduction);
        this.value = value;
    }

    public boolean isAnyOwner(){
        return !ownerlist.isEmpty();
    }

    public void ifWasSold(Human seller, Human buyer){
        if(isSold)
            System.out.println("This car was sold from " + seller.fullname + " to " + buyer.fullname);
        if(!isSold)
            System.out.println("No, it wasn't sold this way");
    }

    public void showHowManyTransactions(){
        System.out.println("Transactions with this car: " + sellCounter);
    }

    @Override
    public void turnOn(){
        System.out.println("The car engine is on");
    }

    public String toString(){
        return "Producer: " + producer + ", model: " + model + ", value: " + value;
    }

    public void showOwnerList(){
        System.out.println(ownerlist);
    }


    @Override
    public void sell (Human seller, Human buyer, Double price) throws Exception{
        isSold = false;
        if(!seller.hasCar(this))
            throw new Exception("A seller doesn't have an auto");

        if(!seller.isLastOwner(this))
            throw new Exception("A seller is not the last owner of this car");

        if(!buyer.hasFreeParkingSlot())
            throw new Exception("A buyer doesn't have space");

        if(buyer.cash < price)
            throw new Exception("A buyer doesn't have enough cash");

        seller.removeCar(this);
        buyer.addCar(this);
        buyer.addOwner(this);
        seller.cash += price;
        buyer.cash -= price;
        isSold = true;
        sellCounter++;
        System.out.println("The car has got sold successfully");
    }
}
