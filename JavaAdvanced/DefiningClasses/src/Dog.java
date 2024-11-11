public class Dog {
    private String name;
    private int age;

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
