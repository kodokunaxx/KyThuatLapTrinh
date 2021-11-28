package DoThi;
import java.util.Scanner;

public class BieuDienDoThiCoHuong {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt(), m = in.nextInt();
            int[][] a = new int[n + 1][n + 1];

            for (int i = 0; i < m; i++) {
                a[in.nextInt()][in.nextInt()] = 1;
            }

            for (int i = 1; i <= n; i++) {
                System.out.print(i + ": ");
                for (int j = 1; j <= n; j++) {
                    if (a[i][j] == 1) {
                        System.out.print(j + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}
