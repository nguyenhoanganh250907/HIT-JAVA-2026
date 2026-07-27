import java.util.Random;
import java.util.Scanner;

public class RandomAdditionQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int a = rd.nextInt(101);
        int b = rd.nextInt(101);
        int c = rd.nextInt(201);

        System.out.printf("%d + %d = %d \n",a,b,c);
        System.out.print("Nhap cau tra loi: ");
        String str = sc.nextLine();

        if (a + b == c){
            if (str.equalsIgnoreCase("phép tính đúng")){
                System.out.print("Bạn đã trả lời đúng");
            }
            else {
                System.out.print("Bạn đã trả lời sai");
            }
        }
        else {
            if (str.equalsIgnoreCase("phép tính sai")){
                System.out.print("Bạn đã trả lời đúng");
            }
            else {
                System.out.print("Bạn đã trả lời sai");
            }
        }

    }
}
