package Bai5;

import Bai1.Smartphone;
import Bai2.Customer;
import Bai3.Store;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Customer customer = new Customer("Nguyen Van A");

        Smartphone iphone = new Smartphone("iPhone 15", 2000, 5);
        Smartphone samsung = new Smartphone("Samsung S24", 1800, 3);

        store.addPhoneToStore(iphone);
        store.addPhoneToStore(samsung);

        store.sellPhone(customer, iphone.getId());

        System.out.println("=== VAT 10% ===");
        System.out.println("Tổng tiền khách: " + customer.calculateTotalBill());
        System.out.println("Giá trị kho: " + store.calculateInventoryValue());

        Smartphone.setVatTax(0.08);
        System.out.println("\n=== VAT 8% ===");
        System.out.println("Tổng tiền khách: " + customer.calculateTotalBill());
        System.out.println("Giá trị kho: " + store.calculateInventoryValue());
    }
}