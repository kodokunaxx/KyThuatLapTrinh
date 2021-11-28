package NganXep;

import java.util.Scanner;
import java.util.Stack;

public class BieuThucTangGiam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soTest = Integer.parseInt(scanner.nextLine());
        while (soTest --> 0) {
            char[] arrInput = (scanner.nextLine() +"I").toCharArray();
            checkTangGiam(arrInput);
            System.out.println();
        }
    }

    private static void checkTangGiam(char[] arrInput) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arrInput.length; i++) {
            if (arrInput[i] == 'I' || i == arrInput.length -1) {

                System.out.print(i+1);
                while (!stack.isEmpty()) {
                    System.out.print(stack.peek());
                    stack.pop();
                }
            }

            if (arrInput[i] == 'D') stack.push(i+1);
        }
    }
}
