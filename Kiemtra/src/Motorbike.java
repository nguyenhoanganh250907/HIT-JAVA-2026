public class Motorbike extends Vehicle{
    public Motorbike(String id, String name, double price, int quantity) {
        super(id, name, price, quantity);
    }

    public Motorbike(){}

    @Override
    double getDiscountPrice() {
        return getPrice() * 0.9;
    }
}
