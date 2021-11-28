package DoThi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFStrenDoThiVoHuong {
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
            bfs(s);
            System.out.println();
        }
    }

    private static void bfs(int u) {
        Queue<Integer> q = new LinkedList<>();
        q.add(u); chuaXet[u] = false;
        while (!q.isEmpty()) {
            int v = q.poll();
            System.out.print(v + " ");
            for (Integer x : dske[v]) {
                if (chuaXet[x]) {
                    q.add(x);
                    chuaXet[x] = false;
                }
            }
        }
    }
}
