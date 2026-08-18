package Bai3;

public class VipAccount extends Account{
    private double point;

    public VipAccount(String username, String email, Address address, double point) {
        super(username, email, address);
        this.point = point;
    }

    public VipAccount(){}

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public double getDiscount() {
        if (point >= 1000) {
            return 0.15;
        }
        else {
            return 0.10;
        }
    }

    @Override
    public String toString() {
        return "VipAccount{" +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                "point=" + point +
                '}';
    }
}
