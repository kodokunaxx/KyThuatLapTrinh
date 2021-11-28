package Stack_Queue;

import java.util.Scanner;

public class SoNhiPhan1DenN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while(t-- > 0) {
            int n = in.nextInt();
            for(int i = 1; i <= n; i++) {
                System.out.print(Integer.toBinaryString(i) + " ");
            }
            System.out.println("");
        }
    }
}
