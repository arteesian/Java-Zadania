public class Main {
    public static void main(String[] args) {
        Car volk = new Car ("Volkswagen", "Golf");

        Human me = new Human();
        me.car = volk;
        System.out.println(me.car.model);
    }
}
