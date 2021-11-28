package LapTrinhCoBan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TongNhoNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soTest = Integer.parseInt(scanner.nextLine());
        while (soTest --> 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            ArrayList<Integer> arrInput = new ArrayList<>();
            for (int i = 0; i < n; i++) {
              arrInput.add(Integer.parseInt(scanner.next()));
            }
            scanner.nextLine();
            tongNhoNhat(arrInput, n);
        }
    }

    private static void tongNhoNhat(ArrayList<Integer> arrInput, int n) {
        long sumOdd = 0, sumEven = 0;
        Collections.sort(arrInput);
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) sumOdd = sumOdd * 10 + arrInput.get(i);
            else sumEven = sumEven * 10 + arrInput.get(i);
        }
        System.out.println(sumEven + sumOdd);
    }
}
