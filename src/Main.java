import devices.Car;
import devices.Phone;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("Xiaomi", "Redmi 8T", 6.2, "android", 2019);
        Car car = new Car("volkswagen", "golf", 5000.0, 2005);

        phone.turnOn();
        car.turnOn();

        System.out.println(phone);
        System.out.println(car);
    }
}
