package com.company.creatures;

public class Pet extends Animal implements Edible{
    public Pet(String species, Double weight) {
        super(species, weight);
    }

    @Override
    public void beEaten(){

    }
}
