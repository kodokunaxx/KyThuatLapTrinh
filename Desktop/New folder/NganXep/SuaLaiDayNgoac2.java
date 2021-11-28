package NganXep;

import java.util.Scanner;
import java.util.Stack;

public class SuaLaiDayNgoac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soTest = Integer.parseInt(scanner.nextLine());
        while (soTest --> 0) {
            char[] arrInput = scanner.nextLine().toCharArray();
            fix(arrInput);
        }
    }

    private static void fix(char[] arrInput) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < arrInput.length; i++) {
            char x = arrInput[i];
            if (x == '(' || (x == ')' && stack.size() == 0)) stack.push(x);
            else if (x == ')') {
                if (stack.size() > 0 && stack.peek() == '(') stack.pop();
                else stack.push(x);
            }
        }

        int a = 0, b = 0;
        while (stack.size() > 0)  {
            if (stack.peek() == '(') a++;
            else b++;
            stack.pop();
        }
        int res = a/2 + b/2 + a%2 + b%2;
        System.out.println(res);
    }
}
