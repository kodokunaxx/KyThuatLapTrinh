package Level1;

import java.util.*;

//  SỐ NGUYÊN TỐ
public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soBoTest = sc.nextInt();
        while (soBoTest-->0) {
            int k = sc.nextInt();
            if (isPrime(k)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if(n == 2){
            return true;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
