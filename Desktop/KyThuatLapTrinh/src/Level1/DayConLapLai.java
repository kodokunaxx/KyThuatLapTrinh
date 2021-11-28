package Level1;

import java.util.Scanner;

public class DayConLapLai
{
    static int c[][];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            char s[] = sc.next().toCharArray();
            System.out.println(qhd(s,n));
        }
    }

    public static int qhd(char s[], int n){
        int i, j;
        c = new int[n+1][n+1];
        for(i=1;i<=n;i++){
            for (j=1;j<=n;j++){
                if(s[i-1] == s[j-1] && i!=j) c[i][j] = c[i-1][j-1] + 1;
                else c[i][j] = Math.max(c[i][j-1],c[i-1][j]);
            }
        }
        return c[n][n];
    }
}
