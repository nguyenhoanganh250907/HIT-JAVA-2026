import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String str = sc.nextLine();
        String upperStr = str.toUpperCase();
        String palindromeStr = "";
        for (int i = str.length() - 1;i >=0;i--){
            palindromeStr += str.charAt(i);
        }

        if (palindromeStr.equalsIgnoreCase(str)){
            System.out.printf("%s chuoi nay doi xung",upperStr);
        }
        else {
            System.out.printf("%s chuoi nay khong doi xung",str);
        }
    }
}
