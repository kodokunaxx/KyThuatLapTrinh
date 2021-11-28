package DoThi;
import java.util.Scanner;

public class ChuyenDSKeSangDSCanh {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int[][] a = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            String str = in.nextLine();
            String[] splits = str.split("\\s+");

            for (int j = 0; j < splits.length; j++) {
                a[i][Integer.parseInt(splits[j])] = a[Integer.parseInt(splits[j])][i] = 1;
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (a[i][j] == 1 && i < j) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}