package LapTrinhCoBan;

import java.util.Scanner;

public class MayATM1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soTest = Integer.parseInt(scanner.nextLine());
        while (soTest --> 0) {
            int n = Integer.parseInt(scanner.next());
            int s = scanner.nextInt();
            int[] arrInput = new int[n];
            for (int i = 0; i < n; i++) {
                arrInput[i] = Integer.parseInt(scanner.next());
            }
            scanner.nextLine();
            atm(arrInput, n, s);
        }
    }

    private static void atm(int[] arrInput, int n, int s) {
        boolean check = false;
        for (int i = 1; i <= n ; i++) {
            boolean stop = false;
            int []b = new int[i];
            for (int j = 0; j < i; j++) {
                b[j] = j+1;
            }
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum += arrInput[b[j] -1];
            }

            if (sum == s) {
                check = true;
                System.out.println(i);
                break;
            } else {
                while (stop == false) {
                    int j = i - 1;
                    while (b[j] == n -i +j +1) {
                        j--;
                        if (j < 0) break;
                    }
                    if (j < 0) {
                        stop = true;
                        break;
                    } else {
                        b[j]++;
                        for (int k = j+1; k < i; k++) {
                            b[k] = b[j] + (k+1) - (j+1);
                        }
                    }

                    sum = 0;
                    for (int k = 0; k < i; k++) {
                        sum += arrInput[b[k] -1];
                    }
                    if (sum == s) {
                        check = true;
                        System.out.println(i);
                        break;
                    }
                }
            }

            if (check) break;
        }
    }
}
