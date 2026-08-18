package Bai2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Book("001", "86",1190, "Asato Asato", 237));
        products.add(new Book("002", "Oregairu",1470, "Watari Wataru", 276));
        products.add(new Electronic("003", "Ti vi", 3500, 12));
        products.add(new Electronic("004","Tu lanh", 5700, 12 ));
        products.add(new Food("005", "Com rang", 660, "12 hours"));

        System.out.println("Danh sach san pham: ");
        for (Product product : products){
            product.showInfo();
            System.out.println("toString(): ");
            System.out.println(product);
            System.out.println();
        }
        double totalOriginalPrice = 0;
        for (Product product : products){
            totalOriginalPrice += product.price;
        }
        double totalSellingPrice = 0;
        for (Product product : products) {
            totalSellingPrice += product.getDiscountedPrice();
        }
        System.out.println("Tong gia tri: ");
        System.out.println("Tong gia tri kho hang (gia goc): " + totalOriginalPrice);
        System.out.println("Tong gia tri neu ban het: " + totalSellingPrice);
    }
}
