package LapTrinhCoBan;

import java.math.BigInteger;
import java.util.Scanner;

public class UclnSoLon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLuongTest = scanner.nextInt();
        while (soLuongTest --> 0){
            BigInteger x = scanner.nextBigInteger();
            BigInteger y = scanner.nextBigInteger();
            System.out.println(x.gcd(y));
        }
    }
}
