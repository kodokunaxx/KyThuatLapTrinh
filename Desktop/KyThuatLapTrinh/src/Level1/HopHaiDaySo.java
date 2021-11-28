package Level1;

import java.util.Scanner;

public class HopHaiDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a[] = new int[n], m = sc.nextInt(), b[] = new int[m];
        boolean A[] = new boolean[1000], B[] = new boolean[1000];
        for (int i=0; i<n;i++){
            a[i] = sc.nextInt();
            A[a[i]] = true;
        }//cho nay là M

        for (int i=0; i<m;i++){
            b[i] = sc.nextInt();
            B[b[i]] = true;
        }
        for (int i=0; i<1000;i++){
            if(A[i] || B[i]){
                System.out.print(i + " ");
            }
        }
    }
}
