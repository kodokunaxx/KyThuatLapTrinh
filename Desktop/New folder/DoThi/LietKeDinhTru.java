package DoThi;

import java.util.ArrayList;
import java.util.Scanner;

public class LietKeDinhTru {
    static ArrayList<Integer>[] arrKe;
    static boolean[] arrChuaXet;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soTest = scanner.nextInt();
        while (soTest --> 0) {
            int soDinh = scanner.nextInt();
            int soCanh = scanner.nextInt();
            arrKe = new ArrayList[soDinh + 1];
            arrChuaXet = new boolean[soDinh + 1];

            for (int i = 0; i < soDinh +1; i++) {
                arrChuaXet[i] = true;
                arrKe[i] = new ArrayList<>();
            }

            for (int i = 1; i <= soCanh ; i++) {
                int begin = scanner.nextInt();
                int end = scanner.nextInt();

                arrKe[begin].add(end);
                arrKe[end].add(begin);
            }

            int soLienThongBanDau = 0;
            for (int i = 1; i <= soDinh ; i++) {
                if (arrChuaXet[i]) {
                    soLienThongBanDau ++;
                    dfs(i);
                }
            }
            for (int i = 1; i <= soDinh ; i++) {
                int soLienThongTMP = 0;
                for (int j = 0; j < arrChuaXet.length; j++) {
                    arrChuaXet[j] = true;
                }
                arrChuaXet[i] = false;
                for (int j = 1; j <= soDinh ; j++) {
                    if (arrChuaXet[j]) {
                        soLienThongTMP ++;
                        dfs(j);
                    }
                }
                if (soLienThongTMP > soLienThongBanDau) System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    private static void dfs(int i) {
        arrChuaXet[i] = false;
        for (Integer v : arrKe[i]) {
            if (arrChuaXet[v]) dfs(v);
        }
    }
}
