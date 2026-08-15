package Bai3;

import Bai1.Smartphone;
import Bai2.Customer;

import java.util.ArrayList;

public class Store {
    private ArrayList<Smartphone> inventory;

    public Store() {
        this.inventory = new ArrayList<>();
    }

    public void addPhoneToStore(Smartphone phone){
        inventory.add(phone);
    }

    public Smartphone search(String id) {
        for (Smartphone i : inventory) {
            if (i.getId().equals(id)) {
                return i;
            }
        }
        return null;
    }

    public ArrayList<Smartphone> search(double minPrice, double maxPrice) {
        ArrayList<Smartphone> result = new ArrayList<>();

        for (Smartphone i : inventory) {
            if (i.getPrice() >= minPrice &&
                    i.getPrice() <= maxPrice) {
                result.add(i);
            }
        }

        return result;
    }

    public ArrayList<Smartphone> search(String keyword, boolean isName) {
        ArrayList<Smartphone> result = new ArrayList<>();

        for (Smartphone smartphone : inventory) {
            if (isName && smartphone.getName().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(smartphone);
            }
        }

        return result;
    }

    public void sellPhone(Customer customer, String phoneId){
        Smartphone sp = search(phoneId);
        if (sp != null && sp.getStock() > 0){
            sp.setStock(sp.getStock() - 1);
            customer.addPhone(sp);
        }
    }

    public double calculateInventoryValue() {
        double total = 0;
        for (Smartphone i : inventory) {
            total += i.getFinalPrice() * i.getStock();
        }
        return total;
    }


}
