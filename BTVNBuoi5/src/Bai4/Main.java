package Bai4;

import Bai1.Smartphone;
import Bai2.Customer;
import Bai3.Store;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Customer customer = new Customer("An");

        Smartphone iphone = new Smartphone("iPhone 15", 20000000, 10);
        store.addPhoneToStore(iphone);

        store.sellPhone(customer, iphone.getId());
        System.out.println(iphone.getStock());
        iphone.setPrice(2500);

        System.out.println(customer.getCart().get(0).getPrice());
    }
}
