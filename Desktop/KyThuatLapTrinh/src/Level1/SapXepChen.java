package Level1;

import java.util.Scanner;

public class SapXepChen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] a = new int[size];
        int[] atemp = new int[size];

        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if (i == 0) {
                atemp[i] = a[i];
            } else {
                int j = 0;
                while (j < i && atemp[j] <= a[i]) {
                    j++;
                }
                for (int k = i; k > j ; k--) {
                    atemp[k] = atemp[k-1];
                }
                atemp[j] = a[i];
            }

            System.out.print("Buoc " +i+ ": ");
            for (int j = 0; j <= i; j++) {
                System.out.print(atemp[j]  +" ");
            }
            System.out.println();
        }
    }
}
