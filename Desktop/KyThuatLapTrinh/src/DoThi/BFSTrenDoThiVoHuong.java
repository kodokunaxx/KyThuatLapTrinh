package DoThi;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSTrenDoThiVoHuong {

    public static boolean[] chuaxet = new boolean[1001];
    public static int n, m, s;
    public static int[][] a = new int[1001][1001];

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            reset();
            n = in.nextInt();
            m = in.nextInt();
            s = in.nextInt();

            for (int i = 1; i <= m; i++) {
                int f = in.nextInt();
                int s = in.nextInt();

                a[f][s] = a[s][f] = 1;
            }

            BFS(s);
            System.out.println("");
        }
    }

    public static void BFS(int u) {
        Queue<Integer> q = new LinkedList<>();
        q.add(u);
        chuaxet[u] = false;
        System.out.print(u+ " ");
        while(!q.isEmpty()) {
            int front = q.poll();
            for(int i = 1; i <= n; i++) {
                if(a[front][i] == 1 && chuaxet[i]) {
                    q.add(i);
                    chuaxet[i] = false;
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static void reset() {
        for (int i = 0; i < 1001; i++) {
            chuaxet[i] = true;
            for (int j = 0; j < 1001; j++) {
                a[i][j] = 0;
            }
        }
    }
}