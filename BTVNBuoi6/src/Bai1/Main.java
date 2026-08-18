package Bai1;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Nguyễn Văn A", "0987654321", "123 Lê Lợi, TPHCM");
        Order order = new Order("001", customer);

        Product p1 = new Product("SP01", "May Tinh", 1500, 2);
        Product p2 = new Product("SP01", "Chuot", 200, 12);
        Product p3 = new Product("SP03", "Dien thoai", 900, 3);

        order.addProduct(p1);
        order.addProduct(p2);
        order.addProduct(p3);
        System.out.println(" ");
        order.printInvoice();
    }
}
