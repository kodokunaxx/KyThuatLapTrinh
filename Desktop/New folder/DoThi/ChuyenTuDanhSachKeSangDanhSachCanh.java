package DoThi;

import java.util.ArrayList;
import java.util.Scanner;

public class ChuyenTuDanhSachKeSangDanhSachCanh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soDinh = Integer.parseInt(scanner.nextLine());
        int[][] arrCanh = new int[soDinh+1][soDinh+1];
        for (int i = 1; i <= soDinh ; i++) {
            String inputDinhKe = scanner.nextLine().trim();
            String[] arrDinhKe = inputDinhKe.split(" ");

            for (int j = 0; j < arrDinhKe.length; j++) {
                int x = Integer.parseInt(arrDinhKe[j]);
                if ( x <= i)  arrCanh[i][x] = 0;
                else arrCanh[i][x] = 1;
            }
        }

        for (int i = 1; i < soDinh+1; i++) {
            for (int j = 1; j < soDinh+1 ; j++) {
                if (arrCanh[i][j] ==1) {
                    System.out.println(i + " " +j);
                }
            }
        }
    }
}
