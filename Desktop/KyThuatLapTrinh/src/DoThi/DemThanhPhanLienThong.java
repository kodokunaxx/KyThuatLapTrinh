package DoThi;
import java.util.Scanner;
import java.util.Stack;

public class DemThanhPhanLienThong {

    public static boolean[] chuaxet = new boolean[1001];
    public static int n, m;
    public static int[][] a = new int[1001][1001], clone = new int[1001][1001];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();

        for (int i = 1; i <= m; i++) {
            int f = in.nextInt();
            int s = in.nextInt();

            a[f][s] = a[s][f] = 1;
            clone[f][s] = clone[s][f] = 1;
        }

        for (int i = 1; i <= n; i++) {
            cloneData(i);

            int count = 0;
            for (int j = 1; j <= n; j++) {
                if (chuaxet[j]) {
                    DFS(j);
                    count++;
                }
            }
            System.out.println(count - 1);
        }
    }

    public static void cloneData(int index) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                clone[i][j] = a[i][j];
            }
        }

        for (int i = 1; i <= n; i++) {
            chuaxet[i] = true;
            clone[index][i] = clone[i][index] = 0;
        }
    }

    public static void DFS(int u) {
        Stack<Integer> stack = new Stack<>();
        stack.push(u);
        chuaxet[u] = false;
        while (!stack.empty()) {
            int top = stack.pop();
            for (int i = 1; i <= n; i++) {
                if (clone[top][i] == 1 && chuaxet[i]) {
                    chuaxet[i] = false;
                    stack.push(top);
                    stack.push(i);
                    break;
                }
            }
        }
    }
}