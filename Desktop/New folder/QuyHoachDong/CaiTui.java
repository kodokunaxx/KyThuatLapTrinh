package QuyHoachDong;

import java.util.Scanner;

public class CaiTui {
    static int f[][], n, v, a[], c[];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t --> 0) {
            n = scanner.nextInt();
            v= scanner.nextInt();
            a = new int[n+1];
            c = new int[n+1];
            f = new int [n+1][v+1];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            for (int i = 0; i <n;  i++) {
                c[i] = scanner.nextInt();
            }
            System.out.println(qhd());
        }
    }

    private static int qhd() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= v ; j++) {
                f[i][j] = f[i-1][j];
                if (j >= a[i]) {
                    f[i][j]  = Math.max(f[i][j], f[i-1][j-a[i]] + c[i]);
                }
            }
        }
        return f[n][v];
    }
}
