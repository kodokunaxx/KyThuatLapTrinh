package LapTrinhCoBan;

import java.util.*;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int soLuong = scanner.nextInt();
        while (soLuong --> 0) {
            int x = scanner.nextInt();
            if (checkNguyenTo(x)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static Boolean checkNguyenTo (int n) {
        if (n < 2) return false;
        else {
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
        }
        return true;
    }

}
