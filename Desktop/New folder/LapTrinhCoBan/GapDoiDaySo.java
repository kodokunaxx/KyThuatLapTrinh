package LapTrinhCoBan;

import java.util.Scanner;

public class GapDoiDaySo {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int soTest = Integer.parseInt(scanner.nextLine());
        while (soTest --> 0) {
            long n = Long.parseLong(scanner.next());
            long k = scanner.nextLong();

            if (k % 2 == 1) System.out.println(1);
            else System.out.println(gapDoiDaySo(n, k));
        }
    }

    private static long gapDoiDaySo(long n, long k) {
        long soPhanTu = (long) Math.pow(2, n) -1;
        long tmp = (soPhanTu +1) / 2;
        if (k == tmp)
            return n;
        if (k < tmp)
            return gapDoiDaySo(n-1, k);
        if (k > tmp)
            return gapDoiDaySo(n - 1, k - tmp);
        return n;
    }
}
