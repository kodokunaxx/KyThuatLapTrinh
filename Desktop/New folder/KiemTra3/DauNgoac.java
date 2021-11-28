package KiemTra3;

import java.util.Scanner;
import java.util.Stack;

public class DauNgoac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soTest = Integer.parseInt(scanner.nextLine());
        while (soTest --> 0) {
            char[] arrInput = scanner.nextLine().toCharArray();
            viTri(arrInput);
        }
    }

    private static void viTri(char[] arrInput) {
        Stack<Integer> stack = new Stack<>();
        String result = "";
        int k = 0;
        for (int i = 0; i < arrInput.length; i++) {
            if (arrInput[i] == '(') {
                k++;
                result+= k+ " ";
                stack.push(k);
            } else if (arrInput[i] == ')') {
                result += stack.peek() + " ";
                stack.pop();
            }
        }
        System.out.println(result);
    }
}
