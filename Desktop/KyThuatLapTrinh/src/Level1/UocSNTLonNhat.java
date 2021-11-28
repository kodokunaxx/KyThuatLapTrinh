package Level1;
import java.math.*;
import java.util.*;

//  ƯỚC SỐ NGUYÊN TỐ LỚN NHẤT
public class UocSNTLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soBoTest = sc.nextInt();
        while (soBoTest-->0){
            long n=sc.nextLong();
            if(isPrime(n)){
                System.out.println(n);
                continue;
            }
            long i=2,result=-1;
            while (i*i<=n){
                if(n%i==0){
                    result=i;
                    n/=i;
                }
                else i++;
            }
            if(n>1) result=n;
            System.out.println(result);
        }
    }

    public static boolean isPrime(long n) {
        if(n<2) return false;
        if(n<4) return true;
        if(n%2==0||n%3==0)
            return false;
        for(long i=5;i*i<=n;i+=6)
            if(n%i==0||n%(i+2)==0)
                return false;
        return true;
    }
}
