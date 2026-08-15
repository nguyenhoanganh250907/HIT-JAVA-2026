package Bai1;

public class Smartphone {
    private static int totalPhones = 0;
    private static double vatTax = 0.10;
    private String id;
    private String name;
    private double price;
    private int stock;

    public Smartphone(String name, double price, int stock) {
        totalPhones++;
        this.id = "SP" + totalPhones;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public Smartphone(){
        totalPhones++;
    }

    public static int getTotalPhones() {
        return totalPhones;
    }


    public String getId() {
        return id;
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
        if(price < 0){
            System.out.println("Price phai lon hon 0");
            this.price = 0;
        }
        else {
            this.price = price;
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if(stock < 0){
            System.out.println("Stock phai lon hon 0");
            this.stock = 0;
        }
        else {
            this.stock = stock;
        }
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Price: " + price;
    }

    public static void setVatTax(double tax){
        vatTax = tax;
    }

    public double getFinalPrice(){
        return price + (price * vatTax);
    }
}
