package model;

public class Toy {
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Toy(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Toy(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
        if (price < 0){
            System.out.println("Giá bán không hợp lệ!");
        }
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0){
            System.out.println("Số lượng không hợp lệ");
        }
        this.quantity = quantity;
    }

    public double calculateDiscount(){
        return 0;
    }

    public void printInfo(){
        System.out.println("Mã: " + id + " Tên: " + name + " Giá: " + price + " Số lượng: " + quantity) ;
    }
}
