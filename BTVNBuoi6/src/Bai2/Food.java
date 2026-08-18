package Bai2;

public class Food extends Product{
    private String expiryDate;

    public Food(String id, String name, double price, String expiryDate) {
        super(id, name, price);
        this.expiryDate = expiryDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public double getDiscountedPrice() {
        return price;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Ngay het han: " + getExpiryDate());
    }

    @Override
    public String toString() {
        return "Food{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", expiryDate='" + expiryDate + '\'' +
                '}';
    }
}
