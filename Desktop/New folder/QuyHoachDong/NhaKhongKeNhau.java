package QuyHoachDong;

import java.util.Scanner;

public class NhaKhongKeNhau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t --> 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            System.out.println(qhd(a,n));
        }
    }

    public static int qhd(int[] a, int n) {
        int f[] = new int[n];
        int i;
        f[0] = a[0];
        f[1] = Math.max(a[0], a[1]);

        for (i = 2; i < n; i ++){
            f[i] = Math.max(f[i-1], f[i-2] +a[i]);
        }
        return f[n-1];
    }
}
