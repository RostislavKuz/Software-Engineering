package example;

public class RockSinger implements Singer {
    private String favouriteGuitar;

    public RockSinger() {
    }

    public RockSinger(String favouriteGuitar) {
        this.favouriteGuitar = favouriteGuitar;
    }

    public void rideMotorcycle() {
        System.out.println("I'm riding motorcycle");
    }

    @Override
    public void sing() {
        System.out.println("Singing rock music");
    }
}
