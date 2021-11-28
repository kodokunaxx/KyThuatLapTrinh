package Level1;
import java.math.*;
import java.util.*;

//  ƯỚC SỐ CHUNG LỚN NHẤT CỦA SỐ NGUYÊN LỚN
public class USCLNCuaSoLon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soBoTest = sc.nextInt();
        while (soBoTest-->0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger x = a.gcd(b);
            System.out.println(x);
        }
    }
}
