package DeQuy;

import java.util.Scanner;

public class SoFibonaciiThuN {

    public static int n, mod = (int) 1e9 + 7;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();

            Matrix m = new Matrix();
            System.out.println(powMatrix(m, n).a[0][1]);
        }
    }

    public static class Matrix {

        long[][] a = new long[2][2];

        public Matrix() {
            a[0][0] = 0;
            a[0][1] = a[1][0] = a[1][1] = 1;
        }
    }

    public static Matrix mulMatrix(Matrix a, Matrix b) {
        Matrix result = new Matrix();
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                result.a[i][j] = 0;
                for (int k = 0; k <= 1; k++) {
                    result.a[i][j] = (result.a[i][j] + (a.a[i][k] * b.a[k][j]) % mod) % mod;
                }
            }
        }

        return result;
    }

    public static Matrix powMatrix(Matrix n, long k) {
        if (k == 1) {
            return n;
        }
        Matrix x = powMatrix(n, k / 2);
        if (k % 2 == 0) {
            return mulMatrix(x, x);
        }
        return mulMatrix(mulMatrix(x, x), n);
    }
}