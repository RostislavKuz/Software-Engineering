package hotel;

public class PriceCalculator {

    public static double calculatePrice(double pricePerDay, int numberOfDays, Season season, DiscountType discountType) {
        double price = pricePerDay * numberOfDays;
        price = price * season.getMultiplier();
        price = price * (100 - discountType.getDiscount()) / 100.0;
        return price;
    }
}
