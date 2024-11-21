package OpinionPoll;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> peopleList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] personalInformation = scanner.nextLine().split("\\s+");
            String name = personalInformation[0];
            int age = Integer.parseInt(personalInformation[1]);

            Person person = new Person(name, age);
            peopleList.add(person);
        }

        peopleList = peopleList.stream().filter(person -> person.getAge() > 30).collect(Collectors.toList());
        peopleList.sort(Comparator.comparing(person -> person.getName()));
        for (Person person : peopleList) {
            System.out.println(person.toString());
        }


    }
}
