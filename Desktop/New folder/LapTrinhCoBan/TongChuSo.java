package LapTrinhCoBan;

import java.util.Arrays;
import java.util.Scanner;

public class TongChuSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLuongTest = scanner.nextInt();
        scanner.nextLine();

        while (soLuongTest --> 0) {
            char[] x = scanner.nextLine().toCharArray();
            Arrays.sort(x);
            int sum = 0;
            for (int i = 0; i < x.length; i++) {
                if(Character.isDigit(x[i])) {
                    sum += x[i] -'0';
                } else {
                    System.out.print(x[i] +"");
                }
            }
            System.out.println(sum);
        }
    }
}
