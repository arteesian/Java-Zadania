package com.company.creatures;

import com.company.Human;
import com.company.Sellable;

public abstract class Animal implements Feedable {
    final String species;
    private Double weight;

    public Animal (String species, Double weight){
        this.species = species;
        this.weight = weight;
    }

    public void Feed(){
        weight += 1;
        if(weight > 0) {
            System.out.println("Thx for food. The current weight is " + weight);
        }else{
            System.out.println("Your pet is dead already. You don't want feed the corpse, right?");
        }
    }

    public void TakeForAWalk(){
        weight -= 1;
        if(weight > 0) {
            System.out.println("I love going for a walk! The current weight is " + weight );
        }else{
            System.out.println("Your pet is dead already. You don't want to drag the corpse with you, right?");
        }
    }

    @Override
    public String toString(){
        return "Species: " + species + ", weight: " + weight;
    }

    @Override
    public void feed(){
        System.out.println("Om nom nom!");
    }

    @Override
    public void feed(Double foodWeight){
        System.out.println("Om nom nom! I have eaten an amount of " + foodWeight);
    }

    /*@Override
    public void sell (Human seller, Human buyer, Double price){
        if(seller.pet != this){
            System.out.println("You can't sell what you don't own");
        }else if(buyer.cash < price){
            System.out.println("You can't afford this");
        }else{
            seller.cash += price;
            buyer.cash -= price;
            buyer.pet = seller.pet;
            seller.pet = null;
            System.out.println("You have sold a pet.");
        }
    }*/

}
