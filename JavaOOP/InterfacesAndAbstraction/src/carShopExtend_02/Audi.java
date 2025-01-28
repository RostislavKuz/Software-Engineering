package carShopExtend_02;

public class Audi extends CarImpl implements Rentable {
    private Integer minRentDay;
    private Double pricePerDay;

    public Audi(String model, String color, Integer horsePower, String countryProduced, Integer minRentDay, Double pricePerDay) {
        super(model, color, horsePower, countryProduced);
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
    }


    @Override
    public Integer getMinRentDay() {
        return this.minRentDay;
    }

    @Override
    public Double getPricePerDay() {
        return this.pricePerDay;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        // Minimum rental period of 3 days. Price per day 99,900000

        builder.append("This is ").append(this.getModel()).append(" produced in ").append(this.countryProduced()).append(" and have ").append(Car.TIRES).append(" tires").append(System.lineSeparator())
                .append("Minimum rental period of ").append(this.getMinRentDay()).append(" days. Price per day ").append(this.getPricePerDay());

        return builder.toString();
    }
}
