package QuyHoachDong;

import java.util.Scanner;

public class DayConTangDaiNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println(qhd(a,n));
    }

    public static int qhd(int[] a, int n) {
        int kq = 0, f[] = new int[n];
        int i, j;
        for ( i = 0; i < n; i++) {
           f[i] = 1;
            for ( j = 0; j < i; j++) {
                if (a[j] < a[i]) {
                    f[i] = Math.max(f[i], f[j] +1);
                }
            }
            kq = Math.max(kq, f[i]);
        }
        return kq;
    }
}
