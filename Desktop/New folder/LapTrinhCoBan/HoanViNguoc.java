package LapTrinhCoBan;

import java.util.Scanner;

public class HoanViNguoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soTest = Integer.parseInt(scanner.nextLine());
        while (soTest -->0) {
            int n = Integer.parseInt(scanner.nextLine());
            hoanViNguoc(n);
            System.out.println();
        }
    }

    private static void hoanViNguoc(int n) {
        int[] a = new int[n];
        int x = n;

        for (int i = 0; i < n; i++) {
            a[i] = i + x;
            x -= 2;
        }

        hienThi(a, n);
        for (int i = 1; i <= giaiThua(n)-1 ; i++) {
            for (int j = n-2; j >= 0 ; j--) {
                if (a[j] > a[j+1]) {
                    int min = 999999999, index = 0;
                    for (int k = j+1; k < n; k++) {
                        if (a[k] < a[j] && a[j]- a[k] < min) {
                            min = a[j] - a[k];
                            index = k;
                        }
                    }
                    int temp = a[j];
                    a[j] = a[index];
                    a[index] = temp;
                    int r = j +1, s = n -1;
                    while (r <= s) {
                        int temp2 = a[r];
                        a[r] = a[s];
                        a[s] = temp2;
                        r++; s--;
                    }
                    break;
                }
            }
            hienThi(a, n);
        }
    }

    private static void hienThi(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.print(" ");
    }

    public static long giaiThua(int n) {
        long kq = 1;
        for (int i = 2; i <= n ; i++) {
            kq*= i;
        }
        return kq;
    }


}
