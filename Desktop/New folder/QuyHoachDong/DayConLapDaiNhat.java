package QuyHoachDong;

import java.util.Scanner;

public class DayConLapDaiNhat {
    static int [][] f;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soTest = Integer.parseInt(scanner.nextLine());
        while (soTest --> 0) {
            f = new int[150][150];
            int n = Integer.parseInt(scanner.nextLine());
            String s = scanner.nextLine();
            dayConTangDaiNhat(s, n);
        }
    }

    private static void dayConTangDaiNhat(String s, int n) {
        s = " " + s;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                f[i][j] = 0;
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i) == s.charAt(j) && i != j) f[i][j] = f[i-1][j-1] + 1;
                else f[i][j] = Math.max(f[i-1][j], f[i][j-1]);
            }
        }

        System.out.println(f[n][n]);
    }
}
