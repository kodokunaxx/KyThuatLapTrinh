package Level1;

import java.util.Scanner;

public class CaiTui {
    static int f[][];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(), v = sc.nextInt();
            int a[] = new int[n+1], c[] = new int[n+1];
            for(int i=1;i<=n;i++) a[i] = sc.nextInt();
            for(int i=1;i<=n;i++) c[i] = sc.nextInt();
            System.out.println(qhd(a,c,n,v));
        }
    }

    public static int qhd(int a[], int c[], int n, int v){
        int i, j;
        f = new int[n+1][v+1];
        for(i=1;i<=n;i++){
            for (j=1;j<=v;j++){
                f[i][j] = f[i-1][j];
                if(j >= a[i])  f[i][j] = Math.max( f[i][j],  f[i-1][j - a[i]] + c[i]);
            }
        }
        return f[n][v];
    }
}
