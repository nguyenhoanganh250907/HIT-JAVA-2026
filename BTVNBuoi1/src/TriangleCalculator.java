import java.util.Scanner;

public class TriangleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập cạnh a: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập cạnh b: ");
        int b = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập cạnh c: ");
        int c = Integer.parseInt(sc.nextLine());

        if (a + b > c && a + c > b && b + c > a){
            if (a == b && b == c && c == a){
                System.out.print("Đây là tam giác đều \n");
            }
            else if(a == b || a == c || b == c){
                System.out.print("Đây là tam giác cân \n");
            }
            else {
                System.out.print("Đây là tam giác thường \n");
            }
            double p = (a + b + c) / 2;
            double heronCaculator = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.print("Chu vi: " + p*2 + " \n");
            System.out.printf("Dien tich: %.2f \n",heronCaculator);
        }
        else {
            System.out.print("Ba cạnh đã nhập không tạo thành một tam giác hợp lệ");
        }
    }
}
