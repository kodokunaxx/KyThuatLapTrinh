package Level1;
import java.util.*;

//  BỘI SỐ CHUNG - ƯỚC SỐ CHUNG
public class BoiSoChungUocSoChung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soBoTest = sc.nextInt();
        while (soBoTest-->0){
            long a = sc.nextInt();
            long b = sc.nextInt();
            System.out.println(BSCNN(a,b) + " " + USCLN(a,b));
        }
    }

    public static long USCLN(long a, long b){
        while (a != b){
            if(a>b){
                a -= b;
            }else {
                b -= a;
            }
        }
        return a;
    }

    public static long BSCNN(long a, long b){
        return (a*b)/USCLN(a,b);
    }
}
