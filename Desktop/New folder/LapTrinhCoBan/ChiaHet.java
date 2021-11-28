package LapTrinhCoBan;

import java.math.BigInteger;
import java.util.Scanner;

public class ChiaHet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soTest = Integer.parseInt(scanner.nextLine());
        while (soTest --> 0) {
            BigInteger a = new BigInteger(scanner.next());
            BigInteger b = new BigInteger(scanner.next());
            scanner.nextLine();
            BigInteger mod0 = new BigInteger("0");
            if (a.compareTo(b) > 0) {
                BigInteger k = a.divide(b);
                if ((b.multiply(k)).equals(a)) System.out.println("YES");
                else System.out.println("NO");
            } else {
                BigInteger k = b.divide(a);
                if ((a.multiply(k)).equals(b)) System.out.println("YES");
                else System.out.println("NO");
            }

        }
    }
}
