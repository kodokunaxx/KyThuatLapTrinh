import java.util.Scanner;

public class DayConDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            float a[] = new float[n], b[] = new float[n];
            int f1[] = new int[n], f2[] = new int[n];
            for (int i=0;i<n;i++){
                a[i]= sc.nextFloat();
                b[n-1-i]= sc.nextFloat();
                f1[i] = 1;
                f2[i] = 1;
            }

            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(a[i]<a[j]){
                        f1[j] = Math.max(f1[i]+1, f1[j]);
                    }
                    if(b[i]<b[j]){
                        f2[j] = Math.max(f2[i]+1, f2[j]);
                    }
                }
            }

            int count1 = 1;
            int count2 = 1;
            for(int i=0;i<n;i++){
                count1 = Math.max(f1[i], count1);
                count2 = Math.max(f2[i], count2);
            }
            if(count1 > count2)
                System.out.println(count2);
            else System.out.println(count1);
        }
    }
}

