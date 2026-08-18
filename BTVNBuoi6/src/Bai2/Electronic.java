package Bai2;

public class Electronic extends Product {
    private int warrantyMonths;

    public Electronic(String id, String name, double price, int warrantyMonths) {
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public double getDiscountedPrice() {
        return price * 1.05;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Bao hanh : " + getWarrantyMonths() + " thang");
    }

    @Override
    public String toString() {
        return "Electronic{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", warrantyMonths=" + warrantyMonths +
                '}';
    }
}
