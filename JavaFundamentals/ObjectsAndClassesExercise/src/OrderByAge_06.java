import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderByAge_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<People> people = new ArrayList<>();


        while (!input.equals("End")) {
            String[] peopleInformation = input.split(" ");

            String name = peopleInformation[0];
            String id = peopleInformation[1];
            int age = Integer.parseInt(peopleInformation[2]);

            People p = new People(name, id, age);
            people.add(p);

            input = scanner.nextLine();
        }

        //Sorting
        people.stream().sorted((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge())).
                forEach(person -> System.out.println(person.peopleInfo()));


    }

    static class People {
        String name;
        String id;
        int age;

        public People(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        public int getAge() {
            return age;
        }

        public String peopleInfo() {
            return String.format("%s with ID: %s is %d years old.", getName(), getId(), getAge());
        }
    }
}
