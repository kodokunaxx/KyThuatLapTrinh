package QuyHoachDong;

import java.util.Scanner;

public class BacThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t--> 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            System.out.println(qhd(n, k));
        }
    }

    private static int qhd(int n, int k) {
        int i, j, f[] = new int[n+1], mod = (int) 1e9+7;
        f[0] = 1; f[1] = 1;
        for ( i = 2; i <= n; i++) {
            for (j= 1; j <= Math.min(k, i); j++) {
                f[i] = (f[i] +f[i-j]) %mod;
            }
        }
        return f[n];
    }
}
