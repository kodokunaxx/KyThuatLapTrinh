package DoThi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LienThong {
    static int soDinh, soCanh, dinhXet;
    static ArrayList<Integer> arrResult, arrTMP;
    static ArrayList<Integer>[] arrKe;
    static boolean[] arrChuaXet;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        soDinh = Integer.parseInt(scanner.next());
        soCanh = Integer.parseInt(scanner.next());
        dinhXet = scanner.nextInt();
        arrResult = new ArrayList<>();
        arrTMP = new ArrayList<>();
        arrKe = new ArrayList[soDinh+1];
        arrChuaXet = new boolean[soDinh+1];

        for (int i = 0; i < soDinh +1; i++) {
            arrChuaXet[i] = true;
            arrKe[i] = new ArrayList<>();
        }

        for (int i = 0; i < soCanh; i++) {
            int begin = Integer.parseInt(scanner.next());
            int end = scanner.nextInt();
            arrKe[begin].add(end);
            arrKe[end].add(begin);
        }
        dfs(dinhXet);

        for (int i = 1; i <= soDinh; i++) {
            if (arrTMP.contains(i)) continue;
            else arrResult.add(i);
        }

        if (arrResult.isEmpty()) System.out.println(0);
        else {
            Collections.sort(arrResult);
            for (int i = 0; i < arrResult.size(); i++) {
                System.out.println(arrResult.get(i));
            }
        }
    }

    private static void dfs(int dinhXet) {
        arrChuaXet[dinhXet] = false;
        arrTMP.add(dinhXet);

        for (int i = 0; i < arrKe[dinhXet].size(); i++) {
            int x = arrKe[dinhXet].get(i);
            if (arrChuaXet[x]) {
                dfs(x);
            }
        }
    }
}
