import java.util.Scanner;

public class MountainPeakCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so nguyen duong N(N > 3): ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap N so nguyen duong: ");
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        int dem = 0;
        int i = 0;
        for (int x : arr){
            if(i > 0 && i < n - 1){
                if (x > arr[i - 1] && x > arr[i + 1]){
                    dem++;
                }
            }
            i++;
        }
        System.out.print("So dinh nui la: " + dem);
    }
}
