package LapTrinhCoBan;

import java.math.BigInteger;
import java.util.Scanner;

public class SoDep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLuongTest = scanner.nextInt();
        while (soLuongTest --> 0) {
            BigInteger x = scanner.nextBigInteger();
            if (kiemTraSoChan(x) && kiemTraThuanNghich(x)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean kiemTraThuanNghich(BigInteger x) {
        String fakeX = x + "";
        StringBuilder rvX = new StringBuilder(fakeX);
        if (fakeX.trim().equals(rvX.reverse().toString().trim()) == false) {
            return false;
        }
        return true;
    }

    private static boolean kiemTraSoChan(BigInteger x) {
        String fakeX = x.toString();
        for (int i = 0; i < fakeX.length(); i++) {
            String lmao = fakeX.charAt(i) + "";
            int check = Integer.parseInt(lmao);
            if (check % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
