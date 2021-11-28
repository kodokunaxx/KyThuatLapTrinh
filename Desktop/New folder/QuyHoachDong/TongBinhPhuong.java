package QuyHoachDong;

import java.util.Scanner;

public class TongBinhPhuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t --> 0) {
            int n = scanner.nextInt();
            System.out.println(qhd(n));
        }
    }

    private static int qhd(int n) {
        int i, j, f[] = new int[n+1];
        for (i = 1; i <= n ; i++) {
            f[i] = i;
            for (j = 2; j<= Math.sqrt(i); j++) {
                f[i] = Math.min(f[i], f[i-j*j] +1);
            }
        }
        return f[n];
    }
}
