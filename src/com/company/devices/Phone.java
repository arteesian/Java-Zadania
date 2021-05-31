package com.company.devices;

import com.company.Human;
import com.company.Sellable;

public class Phone extends Device implements Sellable {
    final public Double screenSize;
    final public String operationSystem;

    public Phone(String producer, String model, Double screenSize, String operationSystem, Integer yearOfProduction){
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
        this.operationSystem = operationSystem;
    }

    @Override
    public void turnOn(){
        System.out.println("Put your finger to unlock");
    }

    @Override
    public void sell (Human seller, Human buyer, Double price){
        if(seller.phone != this){
            System.out.println("You can't sell what you don't own");
        }else if(buyer.cash < price){
            System.out.println("You can't afford this");
        }else{
            seller.cash += price;
            buyer.cash -= price;
            buyer.pet = seller.pet;
            seller.pet = null;
            System.out.println("You have sold a phone.");
        }
    }
}

