package QuyHoachDong;

import java.util.Scanner;

public class XauConDoiXung {
    static boolean f[][];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            char[] s = scanner.next().toCharArray();
            System.out.println(qhd(s));
        }
    }

    public static int qhd(char s[]){
        int i,j,k, n= s.length, kq=1;
        f= new boolean [n][n];
        for( i=0; i<n ;i++){
            for(j=0;j<n;j++){
                if (i==j) f[i][j]=true;
                else f[i][j]=false;
            }
        }
        for( k=1; k<n ; k++){
            for( i=0; i< n-k ; i++){
                j= i + k;
                if(s[i]==s[j]){
                    if(k==1) f[i][j]=true;
                    else f[i][j]= f[i+1][j-1];
                }
                if( f[i][j]) kq =Math.max(kq, j-i+1);
            }
        }
        return kq;
    }
}
