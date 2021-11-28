package DoThi;

import java.util.ArrayList;
import java.util.Scanner;

public class DFStrenDoThiVoHuong {
    static  boolean[] arrChuaXet;
    static  ArrayList<Integer>[] arrKe;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soTest = Integer.parseInt(scanner.nextLine());
        while (soTest-- > 0) {
            int soDinh = Integer.parseInt(scanner.next());
            int soCanh = Integer.parseInt(scanner.next());
            int dinhXuatPhat = scanner.nextInt();
            arrKe = new ArrayList[soDinh + 1];
            arrChuaXet = new boolean[soDinh + 1];

            for (int i = 0; i < soDinh+1 ; i++) {
                arrKe[i] = new ArrayList<>();
                arrChuaXet[i] = true;
            }

            for (int i = 1; i <= soCanh; i++) {
                int begin = Integer.parseInt(scanner.next());
                int end = scanner.nextInt();
                arrKe[begin].add(end);
                arrKe[end].add(begin);
            }

            dfs(dinhXuatPhat);
            System.out.println();
        }
    }

    private static void dfs(int dinhXuatPhat) {
        System.out.print(dinhXuatPhat + " ");
        arrChuaXet[dinhXuatPhat] = false;
        for (int i = 0; i < arrKe[dinhXuatPhat].size(); i++) {
            if (arrChuaXet[arrKe[dinhXuatPhat].get(i)]) dfs(arrKe[dinhXuatPhat].get(i));
        }
    }
}
