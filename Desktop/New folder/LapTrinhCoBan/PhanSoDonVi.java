package LapTrinhCoBan;

import java.util.Scanner;

public class PhanSoDonVi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soTest = scanner.nextInt();
        while (soTest --> 0) {
            int tu = scanner.nextInt();
            int mau = scanner.nextInt();
            tachPhanSoDonVi(tu, mau);
            System.out.println();
        }
    }

    private static void tachPhanSoDonVi(int tu, int mau) {
        if (mau % tu == 0) {
            System.out.print("1/" + (mau/tu));
            return;
        } else {
            int temp = mau/tu + 1;
            System.out.print("1/" + temp + " + ");
            tachPhanSoDonVi(tu*temp - mau, mau*temp);
        }
    }
}
