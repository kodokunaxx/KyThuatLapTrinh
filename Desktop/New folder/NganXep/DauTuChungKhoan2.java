package NganXep;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class DauTuChungKhoan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soTest = Integer.parseInt(scanner.nextLine());
        while (soTest --> 0) {
            int size = scanner.nextInt();
            ArrayList<Integer> arrInput = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                arrInput.add(Integer.parseInt(scanner.next()));
            }
            theoDoiCk(arrInput, size);
        }
    }

    private static void theoDoiCk(ArrayList<Integer> arrInput, int size) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int[] arrResult = new int[size];
        arrResult[0] = 1;

        for (int i = 1; i < arrInput.size(); i++) {
            while (!stack.isEmpty() && arrInput.get(i) >= arrInput.get(stack.peek())) stack.pop();
            if (stack.isEmpty()) arrResult[i] = i+1;
            else arrResult[i] =  i - stack.peek();
            stack.push(i);
        }

        for (int i = 0; i < arrResult.length; i++) {
            System.out.print(arrResult[i] + " ");
        }
        System.out.println();
    }
}
