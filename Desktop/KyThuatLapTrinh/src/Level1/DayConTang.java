package Level1;

import java.util.Scanner;

public class DayConTang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println(qhd(a,n));
    }

    public static int qhd(int a[], int n){
        int f[] = new int[n], i, j, kq = 0;
        f[0] = 1;
        for (i=1;i<n;i++){
            f[i] = 1;
            for(j=0;j<i;j++){
                if(a[j] < a[i]){
                    f[i] = Math.max(f[i], f[j]+1);
                }
            }
            kq = Math.max(kq, f[i]);
        }
        return kq;
    }
}
