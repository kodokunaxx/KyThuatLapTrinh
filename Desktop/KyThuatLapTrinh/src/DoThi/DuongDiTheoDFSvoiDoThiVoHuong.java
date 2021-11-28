package DoThi;

import java.util.*;

public class DuongDiTheoDFSvoiDoThiVoHuong {

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


            DFS(u);
            trace(u, v);
        }
    }

    public static void DFS(int u) {
        Stack<Integer> st = new Stack();
        chuaxet[u] = false;
        st.push(u);
        while (!st.empty()) {
            int top = st.pop();
            for (int i = 1; i <= n; i++) {
                if (a[top][i] == 1 && chuaxet[i]) {
                    chuaxet[i] = false;
                    st.push(top);
                    st.push(i);
                    truoc[i] = top;
                    break;
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
            System.out.println("-1");
            return;
        }
        List<Integer> list = new ArrayList<>();

        while (u != v) {
            if (v == 0) {
                System.out.println("-1");
                return;
            }

            list.add(v);
            v = truoc[v];
        }
        list.add(u);
        if (list.size() == 1) {
            System.out.println("-1");
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