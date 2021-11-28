import java.util.Scanner;

public class TapHopSoNguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        boolean A[] = new boolean[1000], B[] = new boolean[1000];
        for (int i=0;i<n;i++){
            a[i] = sc.nextInt();
            A[a[i]] = true;
        }

        for (int i=0;i<m;i++){
            b[i] = sc.nextInt();
            B[b[i]] = true;
        }

        for (int i = 0; i<1000;i++){
            if(A[i] && B[i]){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 0; i<1000;i++){
            if(A[i] && !B[i]){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 0; i<1000;i++){
            if(!A[i] && B[i]){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
//xxx