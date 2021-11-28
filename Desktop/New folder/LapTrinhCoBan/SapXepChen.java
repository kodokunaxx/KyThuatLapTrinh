package LapTrinhCoBan;

import java.util.ArrayList;
import java.util.Scanner;

public class SapXepChen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arrNumber = new int[size];
        int[] arrTMP = new int[size];

        for (int i = 0; i < size; i++) {
            arrNumber[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if (i == 0) {
                arrTMP[i] = arrNumber[i];
            } else {
                int j = 0;
                while (j < i && arrTMP[j] <= arrNumber[i]) {
                    j++;
                }
                for (int k = i; k > j ; k--) {
                    arrTMP[k] = arrTMP[k-1];
                }
                arrTMP[j] = arrNumber[i];
            }

            System.out.print("Buoc " +i+ ": ");
            for (int j = 0; j <= i; j++) {
                System.out.print(arrTMP[j]  +" ");
            }
            System.out.println();
        }
    }
}
