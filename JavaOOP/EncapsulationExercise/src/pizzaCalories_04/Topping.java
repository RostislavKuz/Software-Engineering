package pizzaCalories_04;

public class Topping {
    private String toppingType;
    private double weight;


    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        switch (toppingType) {
            case "Meat":
            case "Veggies":
            case "Cheese":
            case "Sauce":
                this.toppingType = toppingType;
                break;
            default:
                String message = String.format("Cannot place %s on top of your pizza.", toppingType);
                throw new IllegalArgumentException(message);
        }
    }

    private void setWeight(double weight) {
        if (weight >= 1 && weight <= 50) {
            this.weight = weight;
        } else {
            String message = String.format("%s weight should be in the range [1..50].", this.toppingType);
            throw new IllegalArgumentException(message);
        }
    }

    public double calculateCalories() {
        double toppingTypeCoefficient = 0;
        if (toppingType.equals("Meat")) {
            toppingTypeCoefficient = 1.2;
        } else if (toppingType.equals("Veggies")) {
            toppingTypeCoefficient = 0.8;
        } else if (toppingType.equals("Cheese")) {
            toppingTypeCoefficient = 1.1;
        } else if (toppingType.equals("Sauce")) {
            toppingTypeCoefficient = 0.9;
        }

        return 2 * this.weight * toppingTypeCoefficient;
    }
}
