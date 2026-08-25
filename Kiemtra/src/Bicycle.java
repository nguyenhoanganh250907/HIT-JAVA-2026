public class Bicycle extends Vehicle{
    public Bicycle(String id, String name, double price, int quantity) {
        super(id, name, price, quantity);
    }

    @Override
    double getDiscountPrice() {
        return getPrice() * 0.85;
    }
}
