package HuongDoiTuong.tichhaidoituongmatran;

import java.util.Scanner;

public class Matrix {
    private int m,n;
    private int matrix[][];

    public Matrix(int m,int n){
        this.m = m;
        this.n = n;
        this.matrix = new int[m][n];
    }

    public void nextMatrix(Scanner in){
        for(int i = 0; i < this.m;i++){
            for (int j = 0 ; j < this.n;j++){
                this.matrix[i][j] = in.nextInt();
            }
        }
    }

    public String mul(Matrix b){
        Matrix res = new Matrix(m,b.n);
        for(int i = 0 ; i < m; i++){
            for(int j = 0; j < b.n;j++){
                for (int k = 0; k < n;k++){
                    res.matrix[i][j] += matrix[i][k] * b.matrix[k][j];
                }
            }
        }
        for(int[] row : res.matrix){
            for(int colummn : row){
                System.out.print(colummn+" ");
            }
            System.out.println();
        }
        return "";
    }
}
