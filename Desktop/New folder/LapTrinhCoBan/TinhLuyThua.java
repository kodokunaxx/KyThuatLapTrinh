package LapTrinhCoBan;

import java.util.Scanner;

public class TinhLuyThua {
    static int mod = (int) 1e9 + 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soTest = 20;
        while (soTest --> 0) {
            int n = Integer.parseInt(scanner.next());
            int k = scanner.nextInt();
            if (n == 0 && k == 0) break;
            else System.out.println(powMod(n, k));
        }
    }

    private static long powMod(int n, int k) {
        if (k == 0) return 1;
        long x = powMod(n, k/2);
        if (k % 2 == 0) return x * x % mod;
        return n * (x * x % mod) % mod;
    }
}
