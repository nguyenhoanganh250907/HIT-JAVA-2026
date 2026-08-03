package app;

import model.ElectronicToy;
import model.PlushToy;
import model.Toy;

public class Main {
    public static void main(String[] args) {

        // Tạo các đối tượng
        Toy toy1 = new Toy(1101,"Bộ xếp hình", 300, 20);

        ElectronicToy toy2 = new ElectronicToy(1102,"Robot thông minh", 800, 10, 12);

        PlushToy toy3 = new PlushToy(1103,"Gấu bông Teddy", 250, 15, "Bông gòn");

        Toy[] toys = {toy1, toy2, toy3};

        for (int i = 0; i < toys.length; i++) {
            toys[i].printInfo();
        }
    }
}