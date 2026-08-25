import javax.naming.Name;

public abstract class Vehicle {
    private String id;
    private String name;
    private double price;
    private int quantity;
    Manufacturer manufacturer;

    public Vehicle(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Vehicle(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    abstract double getDiscountPrice();

    void displayInfo(){
        System.out.println("Id: " + id);
        System.out.println("Tên: " + name);
        System.out.println("Giá: " + price);
        System.out.println("Số lượng: " + quantity);
    }
}
