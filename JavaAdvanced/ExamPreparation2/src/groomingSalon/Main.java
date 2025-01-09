package groomingSalon;

public class Main {

    public static void main(String[] args) {

        Pet pet = new Pet("Momo", 23, "Rostik");
        Pet pet2 = new Pet("Gura", 21, "Gary");
        Pet pet3 = new Pet("Nina", 20, "Roy");

        GroomingSalon groomingSalon = new GroomingSalon(20);

        groomingSalon.add(pet);
        groomingSalon.add(pet2);
        groomingSalon.add(pet3);

        //System.out.println(pet);

        Pet pet1 = groomingSalon.getPet("Momo", "Rostik");
        Pet pet5 = groomingSalon.getPet("Moo", "Rostik");
        System.out.println(pet1);
        System.out.println(pet5);

        System.out.println(groomingSalon.getCount());
        System.out.println(groomingSalon.remove("Nina"));
        System.out.println(groomingSalon.getCount());

        System.out.println(groomingSalon.getStatistics());


    }
}
