package Level1;

import java.util.Scanner;

public class SapXepChon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }
        sapXepChon(a);
    }

    private static void sapXepChon(int[] a) {
        int count = 1;
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }

            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
            System.out.print("Buoc " + (count) + ": ");
            for (int j = 0; j < a.length; j++) {
                if (j == a.length - 1) {
                    System.out.println(a[j]);
                } else {
                    System.out.print(a[j] + " ");
                }
            }
            count++;
        }
    }
}
