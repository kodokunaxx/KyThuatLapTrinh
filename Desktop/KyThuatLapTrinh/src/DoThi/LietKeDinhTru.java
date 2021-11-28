package DoThi;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class LietKeDinhTru {

    public static boolean[] chuaxet = new boolean[1001];
    public static int n, m;
    public static int[][] a = new int[1001][1001], clone = new int[1001][1001];

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

            int countBeforeCal = 0;
            for (int i = 1; i <= n; i++) {
                if (chuaxet[i]) {
                    DFS(i, a);
                    countBeforeCal++;
                }
            }


            List<Integer> list = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                clone(i);

                int count = 0;
                for (int j = 1; j <= n; j++) {
                    if (chuaxet[j]) {
                        DFS(j, clone);
                        count++;
                    }
                }

                if (count - 1> countBeforeCal) {
                    list.add(i);
                }
            }

            for (Integer i : list) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }

    }
    public static void reset() {
        for (int i = 1; i <= 1000; i++) {
            chuaxet[i] = true;
            for (int j = 0; j <= 1000; j++) {
                a[i][j] = 0;
            }
        }
    }

    public static void DFS(int u, int[][] data) {
        Stack<Integer> stack = new Stack<>();
        stack.push(u);
        chuaxet[u] = false;
        while (!stack.empty()) {
            int top = stack.pop();
            for (int i = 1; i <= n; i++) {
                if (data[top][i] == 1 && chuaxet[i]) {
                    chuaxet[i] = false;
                    stack.push(top);
                    stack.push(i);
                    break;
                }
            }
        }
    }

    public static void clone(int index) {
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

}