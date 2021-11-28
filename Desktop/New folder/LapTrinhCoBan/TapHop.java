package LapTrinhCoBan;

import java.util.Scanner;

public class TapHop {
    static int[] a;
    static int dem, n , k, s;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soTest = 100;
        while (soTest-->0) {
            n = Integer.parseInt(scanner.next());
            k = Integer.parseInt(scanner.next());
            s = scanner.nextInt();
            dem = 0;
            a = new int[150];

            if (n == 0 && k == 0 && s == 0) {
                System.out.println(1);
                break;
            }

            for (int i = 1; i <= n ; i++) {
                a[i] = i;
            }
            a[0] =0;
            quayLui(1);
            System.out.println(dem);
        }
    }

    private static void quayLui(int i) {
        for (int j = a[i-1] +1; j <= n-k +i; j++) {
            a[i] = j;
            if (i == k) {
                int tong = 0;
                for (int l = 1; l <= k ; l++) {
                    tong += a[l];
                }
                if (tong == s) dem ++;
            } else {
                quayLui(i+1);
            }
        }
    }
}
