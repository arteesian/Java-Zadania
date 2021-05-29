public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("dog", 0.0);

        dog.Feed();
        dog.Feed();
        dog.TakeForAWalk();
        dog.Feed();
        dog.TakeForAWalk();
        dog.TakeForAWalk();
    }
}
