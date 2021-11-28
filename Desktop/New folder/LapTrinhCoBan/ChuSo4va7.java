package LapTrinhCoBan;

import java.math.BigInteger;
import java.util.Scanner;

public class ChuSo4va7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] arrNuber = scanner.nextBigInteger().toString().toCharArray();
        int sum = 0;

        for (int i = 0; i < arrNuber.length; i++) {
            if (arrNuber[i] == '4' || arrNuber[i] == '7') {
                sum += 1;
            }
        }

        if (sum == 4 || sum == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
