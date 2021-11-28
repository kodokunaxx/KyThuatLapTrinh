package DoThi;

import java.util.Scanner;
import java.util.Stack;

public class DFSTrenDoThiVoHuong {

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

            DFS(s);
            System.out.println("");
        }
    }

    public static void DFS(int u) {
        Stack<Integer> st = new Stack();
        chuaxet[u] = false;
        st.push(u);
        System.out.print(u + " ");

        while (!st.empty()) {
            int top = st.pop();
            for (int i = 1; i <= n; i++) {
                if (a[top][i] == 1 && chuaxet[i]) {
                    chuaxet[i] = false;
                    st.push(top);
                    st.push(i);
                    System.out.print(i + " ");
                    break;
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