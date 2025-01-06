package strategyPattern;

import java.util.Comparator;

public class ComparatorPeopleByNameLength implements Comparator<Person> {
    @Override
    public int compare(Person firstPerson, Person secondPerson) {
        int result = Integer.compare(firstPerson.getName().length(), secondPerson.getName().length());
        if (result == 0) {
            //result = Integer.compare(firstPerson.getName().toLowerCase().charAt(0), secondPerson.getName().toLowerCase().charAt(0));
            //result = firstPerson.getName().toLowerCase().substring(0, 1).compareTo(firstPerson.getName().toLowerCase().substring(0, 1));
            result = firstPerson.getName().toLowerCase().charAt(0) - secondPerson.getName().toLowerCase().charAt(0);
        }
        return result;
    }
}
