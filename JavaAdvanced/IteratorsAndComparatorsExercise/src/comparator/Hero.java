package comparator;

public class Hero implements Comparable<Hero> {
    private String name;
    private int power;

    public Hero(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public int compareTo(Hero otherHero) {
        return this.name.compareTo(otherHero.getName());
    }
}
