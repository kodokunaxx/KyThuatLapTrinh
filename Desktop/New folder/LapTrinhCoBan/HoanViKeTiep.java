package LapTrinhCoBan;

import java.util.Scanner;

public class HoanViKeTiep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soTest = Integer.parseInt(scanner.nextLine());
        while (soTest --> 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(scanner.next());
                a[i] = x;
            }
            scanner.nextLine();
            hoanViKeTiep(a, n);
            System.out.println();
        }
    }

    private static void hoanViKeTiep(int[] a, int n) {
        boolean check = false;
        for (int i = n-2; i >= 0 ; i--) {
            if (a[i] < a[i+1]) {
                check = true;
                for (int j = n-1; j >= i+1 ; j--) {
                    if (a[j] > a[i]) {
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                        break;
                    }
                }
                    int r = i+1, s = n-1;
                    while (r <= s) {
                        int temp = a[r];
                        a[r] = a[s];
                        a[s] = temp;
                        r++; s--;
                    }
                    break;
                }
        }
        if (check == true)
            for (int i = 0; i < n; i++)
                System.out.print(a[i] + " ");

        else
            for (int i = n-1; i >= 0; i--)
                System.out.print(a[i] + " ");
    }
}
