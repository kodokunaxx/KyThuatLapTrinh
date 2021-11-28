package LapTrinhCoBan;

import java.util.Scanner;

public class MangDoiXung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLuongTest = scanner.nextInt();
        while (soLuongTest --> 0) {
            int doDaiMang = scanner.nextInt();
            int[] arrTest = new int[doDaiMang];
            for (int i = 0; i < arrTest.length; i++) {
                arrTest[i] = scanner.nextInt();
            }
            if (doiXung(doDaiMang, arrTest)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static boolean doiXung(int length, int[] arr) {
        int d = 0, c = length-1;
        while (d < c) {
            if (arr[d] != arr[c]) {
                return false;
            }
            else {
                d++;
                c--;
            }
        }
        return true;
    }
}
