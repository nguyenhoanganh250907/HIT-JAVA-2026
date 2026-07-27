import java.util.Scanner;

public class MedianFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập 3 số nguyên A B C: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        System.out.println(((A > B && A < C) || (A < B && A > C)) ? A : ((B > A && B < C) || (B < A && B > C)) ? B : C);
    }
}
