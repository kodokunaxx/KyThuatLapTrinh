package LapTrinhCoBan;

import java.util.Scanner;

public class SoLienKe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLuongTest = scanner.nextInt();
        while (soLuongTest --> 0) {
            char[] arrNumber = scanner.next().toCharArray();
            int check = 0;
            for (int i = 0; i < arrNumber.length-1; i++) {
                if (Math.abs(arrNumber[i] - arrNumber[i+1]) != 1) {
                    System.out.println("NO");
                    check++;
                    break;
                }
            }
            if (check == 0) {
                System.out.println("YES");
            }
        }
    }
}
