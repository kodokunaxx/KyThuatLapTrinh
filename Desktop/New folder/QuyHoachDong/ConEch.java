package QuyHoachDong;

import java.util.Scanner;

public class ConEch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] arrStep = new long[55];
        arrStep[1] = 1; arrStep[2] = 2; arrStep[3] = 4;
        for (int i = 4; i <= 50; i++) {
            arrStep[i] = arrStep[i-1] +arrStep[i-2] +arrStep[i-3];
        }
        int t = scanner.nextInt();
        while (t --> 0) {
            int position = scanner.nextInt();
            System.out.println(arrStep[position]);
        }
    }
}
