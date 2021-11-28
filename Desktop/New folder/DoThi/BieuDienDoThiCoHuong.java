package DoThi;

import java.util.ArrayList;
import java.util.Scanner;

public class BieuDienDoThiCoHuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soTest = Integer.parseInt(scanner.nextLine());
        while (soTest --> 0) {
            int soDinh = Integer.parseInt(scanner.next());
            int soCanh = scanner.nextInt();
            int[][] arrInput = new int[soDinh+1][soDinh+1];
            while (soCanh --> 0) {
                int x = Integer.parseInt(scanner.next());
                int y = scanner.nextInt();
                arrInput[x][y] = 1;
            }
            danhSachKe(arrInput, soDinh);
        }
    }

    private static void danhSachKe(int[][] arrInput, int soDinh) {
        for (int i = 1; i < soDinh+1; i++) {
            ArrayList<Integer> arrDinhKe = new ArrayList<>();
            for (int j = 1; j < soDinh+1; j++) {
                if (arrInput[i][j] == 1) {
                    arrDinhKe.add(j);
                }
            }
            System.out.print(i + ": ");
            for (int j = 0; j < arrDinhKe.size(); j++) {
                System.out.print(arrDinhKe.get(j) + " ");
            }
            System.out.println();
        }
    }
}
