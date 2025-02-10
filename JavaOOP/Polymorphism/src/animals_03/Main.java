package animals_03;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Cat("Tom", "Whiskas");
        Animal animal2 = new Dog("Richard", "Meat");

        System.out.println(animal1.explainSelf());
        System.out.println(animal2.explainSelf());
    }
}
