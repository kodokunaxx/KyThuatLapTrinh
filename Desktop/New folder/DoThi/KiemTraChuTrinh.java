package DoThi;

import java.util.ArrayList;
import java.util.Scanner;

public class KiemTraChuTrinh {
    static ArrayList<Integer>[] arrKe;
    static boolean[] arrChuaXet;
    static boolean check;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soTest = scanner.nextInt();
        while (soTest --> 0) {
            int soDinh = scanner.nextInt();
            int soCanh = scanner.nextInt();
            arrKe = new ArrayList[soDinh + 1];
            arrChuaXet = new boolean[soDinh+1];
            check = false;

            for (int i = 0; i < soDinh +1; i++) {
                arrKe[i] = new ArrayList<>();
                arrChuaXet[i] = true;
            }
            for (int i = 0; i < soCanh; i++) {
                int begin = scanner.nextInt();
                int end = scanner.nextInt();
                arrKe[begin].add(end);
                arrKe[end].add(begin);
            }

            for (int i = 1; i <= soDinh ; i++) {
                if (arrChuaXet[i] ==  true) {
                    dfs(i, -1);
                }

                if (check == true) break;
            }
            if (check == true) System.out.println("YES");
            else System.out.println("NO");
        }
    }

     public static void dfs(int x, int parent) {
        arrChuaXet[x] = false;
         for (int i = 0; i < arrKe[x].size(); i++) {
             int k = arrKe[x].get(i);
             if (arrChuaXet[k] == true) {
                 dfs(k,x);
             } else if (k != parent && arrChuaXet[k] == false) {
                 check= true;
                 break;
             }
         }
     }
}
