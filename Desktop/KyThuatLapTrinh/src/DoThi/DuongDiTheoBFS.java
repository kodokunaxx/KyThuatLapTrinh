package DoThi;

import java.util.*;

public class DuongDiTheoBFS {

    public static boolean[] chuaxet = new boolean[1001];
    public static int n, m, u, v;
    public static int[][] a = new int[1001][1001];
    public static int[] truoc = new int[1001];

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            reset();
            n = in.nextInt();
            m = in.nextInt();
            u = in.nextInt();
            v = in.nextInt();

            for (int i = 1; i <= m; i++) {
                int f = in.nextInt();
                int s = in.nextInt();

                a[f][s] = a[s][f] = 1;
            }


            for (int i=1; i<=n;i++){
                BFS(u);
                if(i==u) continue;
                trace(u, i);
            }
        }
    }

    public static void BFS(int u) {
        Queue<Integer> q = new LinkedList<>();
        q.add(u);
        chuaxet[u] = false;
        while (!q.isEmpty()) {
            int front = q.poll();
            for (int i = 1; i <= n; i++) {
                if (a[front][i] == 1 && chuaxet[i]) {
                    q.add(i);
                    truoc[i] = front;
                    chuaxet[i] = false;
                }
            }
        }
    }

    public static void reset() {
        for (int i = 0; i < 1001; i++) {
            chuaxet[i] = true;
            truoc[i] = 0;
            for (int j = 0; j < 1001; j++) {
                a[i][j] = 0;
            }
        }
    }

    public static void trace(int u, int v) {

        if (chuaxet[v]) {
            System.out.println("No path");
            return;
        }
        List<Integer> list = new ArrayList<>();

        while (u != v) {
            if (v == 0) {
                System.out.println("No path");
                return;
            }

            list.add(v);
            v = truoc[v];
        }
        list.add(u);
        if (list.size() == 1) {
            System.out.println("No path");
            return;
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
            if (i != 0) {
                System.out.print(" ");
            }
        }

        System.out.println("");
    }
}