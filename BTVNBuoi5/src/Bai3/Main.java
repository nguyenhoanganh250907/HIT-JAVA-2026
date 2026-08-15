package Bai3;

import Bai1.Smartphone;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        store.addPhoneToStore(new Smartphone("iPhone 15", 2000, 10));
        store.addPhoneToStore(new Smartphone("Samsung S24", 1800, 15));
        store.addPhoneToStore(new Smartphone("Xiaomi 14", 1200, 20));
        store.addPhoneToStore(new Smartphone("Iqoo 13", 1500, 8));
        store.addPhoneToStore(new Smartphone("Oppo Reno 11", 900, 12));

        System.out.println(store.search("SP3"));
        System.out.println(store.search(1000,1600));
        System.out.println(store.search("Iphone",true));
    }
}
