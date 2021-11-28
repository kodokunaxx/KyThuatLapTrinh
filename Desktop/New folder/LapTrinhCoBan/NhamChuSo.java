package LapTrinhCoBan;

import java.util.Scanner;

public class NhamChuSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        String y = scanner.next();
        char[] a = x.toCharArray();
        char[] b = y.toCharArray();
        char[] a1 = x.toCharArray();
        char[] b1= y.toCharArray();
        nhamChuSo(a, b, a1, b1);
    }

    private static void nhamChuSo(char[] a,  char[] b, char[] a1, char[] b1) {
        int length1 = a.length, length2 = b.length;
        for (int i = 0; i < length1; i++) {
            if (a[i] == '6') a[i] = '5';
        }
        for (int i = 0; i < length2; i++) {
            if (b[i] == '6') b[i] = '5';
        }

        System.out.print(doiChuoi(a) + doiChuoi(b));
        System.out.print(" ");

        for (int i = 0; i < length2; i++) {
            if (a1[i] == '5') a1[i] = '6';
        }
        for (int i = 0; i < length2; i++) {
            if (b1[i] == '5') b1[i] = '6';
        }

        System.out.print(doiChuoi(a1) + doiChuoi(b1));
    }

    private static int doiChuoi(char[] a) {
        int kq = 0, dai = a.length;
        for (int i = 0; i < dai; i++) {
            kq = kq * 10 + (a[i] - '0');
        }
        return kq;
    }
}

