package DeQuy;

import java.util.Scanner;

public class LuyThua {
    static int mod = (int) 1e9 + 7;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(powMod(n,k));
        }
    }
    public static long powMod(int n,long k){
        if(k==0){
            return 1;
        }
        long x = powMod(n, k/2);
        if(k%2==0){
            return x*x%mod;
        }
        return n*(x*x%mod)%mod;
    }
}
