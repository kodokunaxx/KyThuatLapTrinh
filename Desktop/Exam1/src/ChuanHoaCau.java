import java.util.Scanner;

public class ChuanHoaCau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n], f[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            f[i] = 1;
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]<a[j]){
                    f[j] = Math.max(f[i]+1, f[j]);
                }
            }
        }
        int max = 1;
        for(int i=0;i<n;i++){
            max = Math.max(f[i], max);
        }
        System.out.println(max);
    }
}
