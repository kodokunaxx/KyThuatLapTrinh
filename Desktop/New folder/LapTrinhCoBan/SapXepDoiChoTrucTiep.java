package LapTrinhCoBan;

import java.util.Scanner;

public class SapXepDoiChoTrucTiep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arrNumber = new int[size];
        int step = 1;

        for (int i = 0; i < size; i++) {
            arrNumber[i] = scanner.nextInt();
        }

        for (int i = 0; i < arrNumber.length-1; i++) {
            for (int j = i+1; j < arrNumber.length; j++) {
                if (arrNumber[i] > arrNumber[j]) {
                    int temp = arrNumber[i];
                    arrNumber[i] = arrNumber[j];
                    arrNumber[j] = temp;
                }
            }

            System.out.print("Buoc " +step+ ": ");
            for (int j = 0; j < arrNumber.length; j++) {
                System.out.print(arrNumber[j] + " ");
            }
            step++;
            System.out.println();
        }
    }
}
