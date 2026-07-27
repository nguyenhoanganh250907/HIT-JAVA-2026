import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ban kinh r: ");
        double radian = Double.parseDouble(sc.nextLine());

        do{
            if (radian < 0 || radian > 1000){
                System.out.println("Nhap lai ban kinh r: ");
                radian = Double.parseDouble(sc.nextLine());
            }
        }while(radian < 0 || radian > 1000);

        System.out.printf("Chu vi hinh tron la: %.3f \n",2*radian*3.14);
        System.out.printf("Dien tich hinh tron la: %.3f",radian*radian*3.14);


    }
}
