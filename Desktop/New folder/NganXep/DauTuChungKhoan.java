package NganXep;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class DauTuChungKhoan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLuongTest = scanner.nextInt();
        while (soLuongTest --> 0) {
            int size = scanner.nextInt();
            int[] arrCK = new int[size];
            for (int i = 0; i < size; i++) {
               arrCK[i] = Integer.parseInt(scanner.next());
            }
            theoDoiCK(size, arrCK);
        }
    }

    private static void theoDoiCK(int size, int[] arrCK) {
        int[] arrResult = new int[size];
        arrResult[0] = 1;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int i = 1; i < size; i++) {
            while (!stack.isEmpty() && arrCK[i] >= arrCK[stack.peek()]) stack.pop();
            if (stack.isEmpty()) arrResult[i] =  i+1;
            else arrResult[i] = i - stack.peek();
            stack.push(i);
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arrResult[i] + " ");
        }
        System.out.println();
    }
}
