package DoThi;
import java.util.*;

public class DuongDiCoHuong {
    static ArrayList<Integer>[] ke;
    static boolean[] chuaxet;
    static int truoc[];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soTest = Integer.parseInt(scanner.nextLine());
        while (soTest-- > 0) {
            int n = Integer.parseInt(scanner.next());
            int m = Integer.parseInt(scanner.next());
            int u = Integer.parseInt(scanner.next());
            int v = scanner.nextInt();
            truoc = new int[n+1];
            ke = new ArrayList[n + 1];
            chuaxet = new boolean[n + 1];

            for (int i = 0; i < chuaxet.length; i++) {
                ke[i] = new ArrayList<>();
                chuaxet[i] = true;
                truoc[i] = 0;
            }
            for (int i = 1; i <= m; i++) {
                int begin = Integer.parseInt(scanner.next());
                int end = scanner.nextInt();

                ke[begin].add(end);
            }

            BFS(u);
            if (chuaxet[v]) System.out.println(-1);
            else {
                ArrayList<Integer> arrResult = new ArrayList<>();
                Stack<Integer> stack = new Stack<>();
                stack.push(v);
                while (stack.peek() != u) {
                    stack.push(truoc[stack.peek()]);
                }

                while (!stack.empty()) {
                    arrResult.add(stack.peek());
                    stack.pop();
                }
                for (int i = 0; i < arrResult.size(); i++) {
                    if (i == arrResult.size()-1)
                        System.out.print(arrResult.get(i));
                    else
                        System.out.print(arrResult.get(i) + " -> ");
                }
                System.out.println();
            }
        }
    }

    private static void BFS(int u) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(u);
        chuaxet[u] = false;

        while (!queue.isEmpty()) {
            int k = queue.poll();
            for (int i = 0; i < ke[k].size(); i++) {
                int tmp = ke[k].get(i);
                if (chuaxet[tmp]) {
                    queue.add(tmp);
                    chuaxet[tmp] = false;
                    truoc[tmp] = k;
                }
            }
        }
    }
}
