package KiemTraThu4;

import java.util.ArrayList;
import java.util.Scanner;

public class DemThanhPhanLienThong {
    static ArrayList<Integer>[] arrKe;
    static boolean[] arrChuaXet;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soDinh = Integer.parseInt(scanner.next());
        int soCanh = scanner.nextInt();
        arrKe = new ArrayList[soDinh+1];
        arrChuaXet = new boolean[soDinh+1];
        for (int i = 0; i < soDinh+1 ; i++) {
            arrKe[i] = new ArrayList<>();
            arrChuaXet[i] = true;
        }

        for (int i = 1; i <= soCanh ; i++) {
            int x = Integer.parseInt(scanner.next());
            int y = scanner.nextInt();
            arrKe[x].add(y);
            arrKe[y].add(x);
        }

        for (int k = 1; k <= soDinh ; k++) {
            int dem = 0;
            for (int i = 1; i <= soDinh; i++) {
                if (i == k) continue;
                else {
                    if(arrChuaXet[i]) {
                        dem++;
                        dfs(i,k);
                    }
                }
            }
            System.out.println(dem);
            for (int i = 0; i < soDinh+1 ; i++) {
                arrChuaXet[i] = true;
            }
        }
    }

    private static void dfs(int i, int k) {
        arrChuaXet[i] = false;
        for (Integer j  : arrKe[i]) {
            if (j!=k) {
                if (arrChuaXet[j]) dfs(j, k);
            }
        }

    }
}
