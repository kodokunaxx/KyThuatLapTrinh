package DeQuy;

import java.util.Arrays;
import java.util.Scanner;

public class DayConCoTongNguyenTo {
    static int b[] = new int[20];
    static int n, a[] = new int[20];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            b = new int[20];
            a = new int[20];
            n = sc.nextInt();
            int x[] = new int[n];
            for (int i = 0; i < n; i++) x[i] = sc.nextInt();
            Arrays.sort(x);
            for (int i = 1; i <= n; i++) {
                a[i] = x[n-i];
            }
            quaylui(1);
        }
    }
    public static void quaylui(int i) {
        for (int j = 0; j <= 1; j++) {
            b[i] = j;
            if(i == n) {
                xuly();
            } else{
                quaylui(i+1);
            }
        }
    }
    public static void xuly() {
        int i, tong = 0;
        for (i = 1;  i <= n; i++) {
            if(b[i] == 1){
                tong += a[i];
            }
        }
        if(ngto(tong)) {
            for (i = 1; i <= n; i++) {
                if(b[i] == 1){
                    System.out.print(a[i] + " ");
                }
            }
            System.out.println();
        }
    }
    public static boolean ngto(int n) {
        if(n<2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
