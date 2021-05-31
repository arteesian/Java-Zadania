package com.company.creatures;

public class FarmAnimal extends Animal implements Edible{
    public FarmAnimal(String species, Double weight) {
        super(species, weight);
    }

    @Override
    public void beEaten(){

    }
}
