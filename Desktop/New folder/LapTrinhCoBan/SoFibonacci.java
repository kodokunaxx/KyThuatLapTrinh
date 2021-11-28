package LapTrinhCoBan;

import java.math.BigInteger;
import java.util.*;

public class SoFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLuong = scanner.nextInt();
        long[] arrViTri = new long[92];
        arrViTri[0] = 1;
        arrViTri[1] = 1;
        for (int i = 2; i < arrViTri.length; i++) {
            arrViTri[i] = arrViTri[i-1] + arrViTri[i-2];
        }
        while (soLuong-->0) {
            int x = scanner.nextInt();
            System.out.println(arrViTri[x-1]);
        }

    }
}
