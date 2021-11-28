package DeQuy;

import java.util.Scanner;

public class SapXepQuanHau1 {
    static int a[] = new int[11], n,count;
    static boolean b[] = new boolean[11];
    static boolean xuoi[] = new boolean[21], nguoc[] = new boolean[21];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            b = new boolean[11];
            xuoi = new boolean[21];
            nguoc = new boolean[21];
            a = new int[11];
            count = 0;
            n = sc.nextInt();
            quaylui(1);
            System.out.println(count);
        }
    }
    public static void quaylui(int i){
        int j;
        for(j=1; j<=n;j++){
            if(!b[j] && !xuoi[i-j+n] && !nguoc[i+j-1]){
                a[i] = j;
                b[j] = true;
                xuoi[i-j+n] = true;
                nguoc[i+j-1] = true;
                if(i == n) {
                    count++;
                } else {
                    quaylui(i+1);
                }
                b[j] = false;
                xuoi[i-j+n] = false;
                nguoc[i+j-1] = false;
            }
        }
    }
}
