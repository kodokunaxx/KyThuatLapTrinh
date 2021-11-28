package DoThi;
import java.util.Scanner;
import java.util.Stack;

public class DemSoThanhPhanLienThong {

    public static boolean[] chuaxet = new boolean[1001];
    public static int n, m;
    public static int[][] a = new int[1001][1001];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            n = in.nextInt();
            m = in.nextInt();

            reset();

            for (int i = 1; i <= m; i++) {
                int f = in.nextInt();
                int s = in.nextInt();

                a[f][s] = a[s][f] = 1;
            }

            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (chuaxet[i]) {
                    DFS(i);
                    count++;
                }
            }
            System.out.println(count);
        }

    }

    public static void reset() {
        for(int i = 1; i <= 1000; i++) {
            chuaxet[i] = true;
            for(int j = 0; j <= 1000; j++) {
                a[i][j] = 0;
            }
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