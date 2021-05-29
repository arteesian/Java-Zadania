public class Animal {
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

}
