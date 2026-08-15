package Bai1;

public class Main {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("Iphone", 1200, 120);
        Smartphone s2 = new Smartphone("Oppo", 1000, 20);
        Smartphone s3 = new Smartphone("Iqoo", 800, 50);

        System.out.println(s1.getId());
        System.out.println(s2.getId());
        System.out.println(s3.getId());
        System.out.println(Smartphone.getTotalPhones());
    }
}

