package KiemTra3;

import java.util.Scanner;
import java.util.Stack;

public class DoanLienTiep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soTest = Integer.parseInt(scanner.nextLine());
        while (soTest --> 0) {
            int size  = scanner.nextInt();
            int[] arrInput = new int[size];
            for (int i = 0; i < size; i++) {
                arrInput[i] = Integer.parseInt(scanner.next());
            }
            doanLienTiep(arrInput);
        }
    }

    private static void doanLienTiep(int[] arrInput) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int[] arrResult  = new int[arrInput.length];
        arrResult[0] = 1;
        for (int i = 0; i < arrInput.length; i++) {
            while (!stack.isEmpty() && arrInput[i] >= arrInput[stack.peek()]) stack.pop();
            if (stack.isEmpty()) arrResult[i] = i+1;
            else arrResult[i] = i - stack.peek();
            stack.push(i);
        }

        for (int i = 0; i < arrResult.length; i++) {
            System.out.print(arrResult[i] + " ");
        }
        System.out.println();
    }
}
