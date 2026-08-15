package Bai2;

import Bai1.Smartphone;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private ArrayList<Smartphone> cart;

    public Customer(String customerName) {
        this.customerName = customerName;
        this.cart = new ArrayList<>();
    }

    public Customer(){}

    public void addPhone(Smartphone phone) {
        cart.add(phone);
    }

    public void removePhone(String id){
        for (Smartphone i : cart){
            if (i.getId().equals(id)){
                cart.remove(i);
            }
        }
    }

    public void removePhone(int index){
        if (index > cart.size()){
            System.out.println("Vi tri khong hop le");
        }
        else {
            cart.remove(index);
        }
    }

    public ArrayList<Smartphone> getCart(){
        ArrayList<Smartphone> cart2 = new ArrayList<>();
        for(Smartphone i : cart){
            cart2.add(i);
        }
        return cart2;
    }

    public double calculateTotalBill(){
        double bill = 0;
        for (Smartphone i : cart){
            bill += i.getFinalPrice() * i.getStock();
        }
        return bill;
    }
}
