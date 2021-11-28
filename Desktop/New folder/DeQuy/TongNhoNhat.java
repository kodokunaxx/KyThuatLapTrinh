package DeQuy;

import java.util.ArrayList;
import java.util.Scanner;

public class TongNhoNhat {
    static int[][] a = new int[10][10];
    static int n;
    static ArrayList<String> kq = new ArrayList<>();
    static int[] dx = {1,0};
    static int[] dy = {0,1};
    static int dem=0;
    public static void backtrack(int x,int y){
        if(x == n-1 && y == n-1){
            dem++;
            for(String str :kq){
                System.out.print(str);
            }
            System.out.print(" ");
        }
        for(int i=0;i<2;i++){
            int mX = x+dx[i];
            int mY = y+dy[i];
            if(mX>=0 && mX<n && mY>=0 && mY<n){
                if(a[mX][mY]==1) {
                    if (i == 0) {
                        kq.add("D");
                    } else {
                        kq.add("R");
                    }
                    backtrack(mX, mY);
                    kq.remove(kq.size() - 1);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            dem=0;
            kq = new ArrayList<>();
            n = in.nextInt();
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    a[i][j]=in.nextInt();
                }
            }
            if(a[0][0]==0){
                System.out.print(-1);
            }
            else{
                backtrack(0,0);
                if(dem==0){
                    System.out.print(-1);
                }}
            System.out.println();
        }
    }
}
