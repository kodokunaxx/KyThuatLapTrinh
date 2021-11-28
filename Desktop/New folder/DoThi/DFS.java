package DoThi;

import java.util.ArrayList;
import java.util.Scanner;

public class DFS {
    static int n, m;
    static ArrayList<Integer> dske[] = new ArrayList[1001];
    static boolean chuaXet[] = new boolean[1001];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t --> 0) {
            n = scanner.nextInt();
            m = scanner.nextInt();
            int s = scanner.nextInt();
            for (int i = 0; i <= n ; i++) {
                dske[i] = new ArrayList<>();
                chuaXet[i] = true;
            }
            for (int i = 1; i <= m ; i++) {
                int u = scanner.nextInt(), v = scanner.nextInt();
                dske[u].add(v);
                dske[v].add(u);
            }
            dfs(s);
            System.out.println();
        }
    }

    private static void dfs(int u) {
        System.out.print(u + " ");
        chuaXet[u] = false;
        for (Integer v : dske[u]) {
            if (chuaXet[v]) dfs(v);
        }
    }
}
