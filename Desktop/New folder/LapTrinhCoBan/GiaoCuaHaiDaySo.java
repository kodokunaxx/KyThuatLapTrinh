package LapTrinhCoBan;

import java.util.Scanner;

public class GiaoCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];
        int checka[] = new int[1000];
        int checkb[] = new int[1000];
        for(int i=0;i<n;i++){
            a[i] = in.nextInt();
            checka[a[i]]++;

        }
        for(int j=0;j<m;j++){
            b[j] = in.nextInt();
            checkb[b[j]]++;

        }
        for(int i=0;i<1000;i++){
            if(checka[i]>=1 && checkb[i]>=1){
                System.out.print(i+" ");
            }
        }
    }
}
