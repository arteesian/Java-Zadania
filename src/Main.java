import devices.Car;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Car("Honda", "Civic").equals(new Car("Honda", "Civic")));

        Animal dog = new Animal("dog", 5.0);
        System.out.println(dog);

        Car honda = new Car("Honda", "Civic");
        Car civic  = new Car("Honda", "Civic");

        System.out.println(honda);
        System.out.println(civic);

        System.out.println(dog);
    }
}
