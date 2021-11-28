package LapTrinhCoBan;

import java.util.Scanner;

public class UCLNvBCNN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLuongTest = scanner.nextInt();
        while (soLuongTest --> 0) {
            long ucln = 1;
            long bcnn = 0;
            long x = scanner.nextLong();
            long y = scanner.nextLong();

            for (int i = 1; i <= x && i <= y; i++) {
                if (x % i == 0 && y % i == 0) {
                    ucln = i;
                }
            }

            bcnn = (x*y) / ucln;
            System.out.println(bcnn +" "+ ucln);
        }
    }
}
