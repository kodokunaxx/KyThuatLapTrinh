package LapTrinhCoBan;

import java.util.Scanner;

public class DiChuyenTrongMeCung {
    static int[] kq;
    static int[][] a;
    static int n;
    static boolean check;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soTest = Integer.parseInt(scanner.nextLine());
        while (soTest-- > 0) {
            kq = new int[100];
            a = new int[20][20];
            n = scanner.nextInt();
            check = false;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    a[i][j] = scanner.nextInt();
                }
            }
            lmao(1);
            if (check == false)
                System.out.println(-1);
            System.out.println();
        }
    }

    private static void lmao(int i) {
        for (int j = 1; j >= 0; j--) {
            kq[i] = j;
            if (i == 2 * n - 2) {
                kiemTra();
            } else {
                lmao(i + 1);
            }
        }
    }

    private static void kiemTra() {
        boolean denDich = true;
        int row = 1, col = 1;
        if (a[1][1] == 1) {
            for (int i = 1; i <= 2*n -2 ; i++) {
                if (kq[i] == 0) col++;
                else row++;
                if (a[row][col] == 0 || row > n || col > n) {
                    denDich = false;
                    break;
                }
            }
            if (denDich == true) {
                check = true;
                hienThi();
            }
        }
    }

    private static void hienThi() {
        for (int i = 1; i <= 2*n -2 ; i++) {
            if (kq[i] == 0) System.out.print("R");
            else System.out.print("D");
        }
        System.out.print(" ");
    }
}
