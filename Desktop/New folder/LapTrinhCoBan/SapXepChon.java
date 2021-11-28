package LapTrinhCoBan;

import java.util.Scanner;

public class SapXepChon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arrNumber = new int[size];
        for (int i = 0; i < size; i++) {
            arrNumber[i] = scanner.nextInt();
        }
        sapXepChon(arrNumber);
    }

    private static void sapXepChon(int[] arrNumber) {
        int count = 1;
        for (int i = 0; i < arrNumber.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arrNumber.length; j++) {
                if (arrNumber[j] < arrNumber[min]) {
                    min = j;
                }
            }

            int temp = arrNumber[min];
            arrNumber[min] = arrNumber[i];
            arrNumber[i] = temp;
            System.out.print("Buoc " + (count) + ": ");
            for (int j = 0; j < arrNumber.length; j++) {
                if (j == arrNumber.length - 1) {
                    System.out.println(arrNumber[j]);
                } else {
                    System.out.print(arrNumber[j] + " ");
                }
            }
            count++;
        }
    }
}
