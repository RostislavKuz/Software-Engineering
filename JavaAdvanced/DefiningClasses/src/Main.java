import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Georgi");
        Dog dog2 = new Dog("Atanas", 6);


        dog.setName("Robert");
        dog.setAge(12);
        Map<String, Dog> myDogs = new HashMap<>();

        myDogs.put("My best dog", dog);

        System.out.println(dog.hashCode());


        //2:16

    }
}
