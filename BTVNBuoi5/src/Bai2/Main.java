package Bai2;

import Bai1.Smartphone;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Nguyen Van A");
        Smartphone s1 = new Smartphone("Iphone", 1200, 120);
        Smartphone s2 = new Smartphone("Oppo", 1000, 20);

        customer.addPhone(s1);
        customer.addPhone(s2);
        System.out.println(customer.getCart());
        customer.getCart().clear();
        System.out.println(customer.getCart().size());
    }
}
