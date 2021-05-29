package devices;

public class Car {
    public final String model;
    public String producer;
    public Double value;

    public Car(String producer, String model){
        this.producer = producer;
        this.model = model;
    }

    @Override
    public String toString(){
        return "Producer: " + producer + ", model: " + model + ", value: " + value;
    }

}
