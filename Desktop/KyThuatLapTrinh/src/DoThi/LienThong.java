package DoThi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class LienThong {

    public static boolean[] chuaxet = new boolean[1001];
    public static int n, m, s;
    public static int[][] a = new int[1001][1001];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        s = in.nextInt();

        reset();
        for (int i = 1; i <= m; i++) {
            int f = in.nextInt();
            int s = in.nextInt();

            a[f][s] = a[s][f] = 1;
        }

        List<Integer> list = new ArrayList<>();
        DFS(s);

        for (int i = 1; i <= n; i++) {
            if (chuaxet[i]) {
                list.add(i);
            }
        }

        if (list.size() == 0) {
            System.out.println("0");
            return;
        }

        Collections.sort(list);
        for (Integer i : list) {
            System.out.println(i);
        }
    }

    public static void reset() {
        for (int i = 1; i <= 1000; i++) {
            chuaxet[i] = true;
        }
    }

    public static void DFS(int u) {
        Stack<Integer> stack = new Stack<>();
        stack.push(u);
        chuaxet[u] = false;
        while (!stack.empty()) {
            int top = stack.pop();
            for (int i = 1; i <= n; i++) {
                if (a[top][i] == 1 && chuaxet[i]) {
                    chuaxet[i] = false;
                    stack.push(top);
                    stack.push(i);
                    break;
                }
            }
        }
    }
}