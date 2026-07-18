import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mật khẩu: ");
        String pwd = sc.nextLine();

        String cleannedPassword = pwd.trim();
        int length = cleannedPassword.length();
        boolean hasDigit = false;
        boolean hasUpper = false;

        for (int i = 0; i < length; i++) {
            char c = cleannedPassword.charAt(i);
            if (c >= '0' && c <= '9') {
                hasDigit = true;
            }
            if (c >= 'A' && c <= 'Z') {
                hasUpper = true;
            }
        }
        if (length >= 8 && hasDigit && hasUpper) {
            System.out.println("Mật khẩu hợp lệ!");
        } else {
            System.out.println("Mật khẩu không hợp lệ!");

            if (length < 8) {
                System.out.printf("- Mật khẩu phải có độ dài tối thiểu là 8 ký tự (Độ dài hiện tại sau khi cắt khoảng trắng: %d). %n", length);
            }
            if (!hasDigit) {
                System.out.println("- Mật khẩu phải chứa ít nhất 1 chữ số.");
            }
            if (!hasUpper) {
                System.out.println("- Mật khẩu phải chứa ít nhất 1 chữ cái viết hoa.");
            }

        }

    }
}