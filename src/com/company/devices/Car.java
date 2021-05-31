package com.company.devices;

import com.company.Human;
import com.company.Sellable;

public class Car extends Device implements Sellable {

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
    public void sell (Human seller, Human buyer, Double price){
        if(seller.getCar()!= this){
            System.out.println("You can't sell what you don't own");
        }else if(buyer.cash < price){
            System.out.println("You can't afford this");
        }else{
            seller.cash += price;
            buyer.cash -= price;
            buyer.pet = seller.pet;
            seller.pet = null;
            System.out.println("You have sold a car.");
        }
    }
}
