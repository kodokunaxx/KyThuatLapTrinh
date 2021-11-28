package LapTrinhCoBan;

import java.math.BigInteger;
import java.util.Scanner;

public class SoTamPhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLuongTest = scanner.nextInt();
        while (soLuongTest --> 0) {
            int check = 0;
            char[]  arrNumber = scanner.nextBigInteger().toString().toCharArray();
            for (int i = 0; i < arrNumber.length; i++) {
                if (arrNumber[i] != '1' && arrNumber[i] != '0' && arrNumber[i] != '2') {
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
