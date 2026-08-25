public class Car extends Vehicle{
    private boolean luxury;

    public Car(String id, String name, double price, int quantity, boolean luxury) {
        super(id, name, price, quantity);
        this.luxury = luxury;
    }

    public boolean isLuxury() {
        return luxury;
    }

    public void setLuxury(boolean luxury) {
        this.luxury = luxury;
    }

    @Override
    double getDiscountPrice() {
        return getPrice();
    }

    public void logLuxury(){
        if (luxury){
            System.out.println("Nhà sản xuất: " + manufacturer.getName());
        }
    }


}
