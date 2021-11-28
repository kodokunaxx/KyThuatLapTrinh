package LapTrinhCoBan;

import java.math.BigInteger;
import java.util.Scanner;

public class SoKhongLienKe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLuongTest = scanner.nextInt();

        while (soLuongTest --> 0) {
            char[] arrNumber = scanner.nextBigInteger().toString().toCharArray();
            if (tongChuSo(arrNumber) == true && khoangCach(arrNumber) == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean tongChuSo (char[] arrNumber) {
        int sum = 0;
        for (int i = 0; i < arrNumber.length; i++) {
            sum += arrNumber[i] - '0';
        }
        if (sum % 10 != 0)
            return false;
        return true;
    }

    public static boolean khoangCach (char[] arrNumber) {
        for (int i = 0; i < arrNumber.length-1; i++) {
            if (Math.abs(arrNumber[i] - arrNumber[i+1]) != 2) {
                return false;
            }
        }
        return true;
    }
}
