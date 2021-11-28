package Level1;

import java.math.BigInteger;
import java.util.Scanner;

public class HieuSoNguyenLon2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger number1 = scanner.nextBigInteger();
        BigInteger number2 = scanner.nextBigInteger();

        System.out.println(number1.subtract(number2));
    }
}
