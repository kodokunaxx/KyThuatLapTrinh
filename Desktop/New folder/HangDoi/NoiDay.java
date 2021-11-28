package HangDoi;

import java.util.*;

public class NoiDay {
    static Scanner sc = new Scanner(System.in);
    static int M = (int) (1E9 + 7);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) solve();
    }

    static void solve() {
        int n = sc.nextInt();
        Queue<Integer> q = new PriorityQueue<>(n);
        while (n-- > 0) q.add(sc.nextInt());

        long res = 0;
        while (q.size() > 1) {
            int a = q.poll(), b = q.poll();
            q.add((a + b) % M);
            res = (res + a + b) % M;
        }
        System.out.println(res);

    }
}
