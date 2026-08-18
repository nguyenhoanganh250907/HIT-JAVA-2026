package Bai3;

public class NormalAccount extends Account{
    public NormalAccount(String username, String email, Address address) {
        super(username, email, address);
    }

    @Override
    public double getDiscount() {
        return 0.05;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
