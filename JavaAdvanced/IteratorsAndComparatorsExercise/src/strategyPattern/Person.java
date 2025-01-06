package strategyPattern;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person otherPerson) {
        int result = this.name.compareTo(otherPerson.getName());
        if (result == 0) {
            result = Integer.compare(this.age, otherPerson.getAge());
        }
        return result;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }
}
