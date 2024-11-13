import java.util.ArrayList;
import java.util.List;

public class Dog {
    private String name;
    private int age;
    public String breed;

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, int age) {
        this(name);
        this.age = age;
    }

    public Dog(String name, int age, String breed) {
        this(name, age);
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println("Bark bark");
    }

    public String toString() {
        return String.format("My dog is called %s and is %d years old", name, age);
    }

}
