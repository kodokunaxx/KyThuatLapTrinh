package LapTrinhCoBan;

import java.util.Scanner;

public class TongGiaiThua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        long sum = 0;

        for (int i = 1; i <= number; i++) {
            sum+= tinhGiaiThua(i);
        }
        System.out.println(sum);
    }

    public static long tinhGiaiThua(int x) {
        long giaiThua = 1;
        if (x == 0 || x == 1) {
            return giaiThua;
        } else {
            for (int i = 2; i <= x; i++) {
                giaiThua *= i;
            }
            return giaiThua;
        }
    }
}
