package carShopExtend_02;

public class Seat extends CarImpl implements Sellable {
    private Double price;

    public Seat(String model, String color, Integer horsePower, String countryProduced, Double price) {
        super(model, color, horsePower, countryProduced);
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("This is ").append(this.getModel()).append(" produced in ").append(this.countryProduced()).append(" and have ").append(Car.TIRES).append(" tires").append(System.lineSeparator())
                .append(this.getModel()).append(" sells for ").append(this.getPrice());

        return builder.toString();
    }
}
