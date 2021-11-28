package OOP.TichHaiMaTran;

import java.util.Scanner;

public class Matrix {
    private int n;
    private int m;
    private int[][] A;

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        A = new int[n][m];
    }

    public void nextMatrix(Scanner sc) {

        A = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                A[i][j] = sc.nextInt();
            }
        }
    }

    public String mul(Matrix mt2) {
        String str="";
        Matrix mt = new Matrix(n, mt2.m);
        for ( int i= 0; i < n; i++) {
            for ( int j= 0; j < mt2.m; j++) {
                mt.A[i][j] = 0;
                for (int k = 0; k < m; k++) {
                    mt.A[i][j] += A[i][k] * mt2.A[k][j];
                }
                str+=mt.A[i][j]+" ";
            }
            str=str+"\n";
        }
        return str;
    }
}
