package strategyPattern;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ComparatorPeopleByNameLength comparatorByName = new ComparatorPeopleByNameLength();
        ComparatorPeopleByAge comparatorByAge = new ComparatorPeopleByAge();

        TreeSet<Person> peopleByName = new TreeSet<>(comparatorByName);
        TreeSet<Person> peopleByAge = new TreeSet<>(comparatorByAge);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            Person person = new Person(name, age);

            peopleByName.add(person);
            peopleByAge.add(person);
        }

        for (Person person : peopleByName) {
            System.out.println(person.toString());
        }
        for (Person person : peopleByAge) {
            System.out.println(person.toString());
        }


    }
}
