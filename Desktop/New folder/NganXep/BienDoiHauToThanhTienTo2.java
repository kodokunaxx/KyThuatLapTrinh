package NganXep;

import java.util.Scanner;
import java.util.Stack;

public class BienDoiHauToThanhTienTo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soTest = Integer.parseInt(scanner.nextLine());
        while (soTest --> 0) {
            char[] hauTo = scanner.nextLine().toCharArray();
            tienTo(hauTo);
        }
    }

    private static void tienTo(char[] hauTo) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < hauTo.length ; i++) {
            char x = hauTo[i];
            if (x == '+' ||x == '-' || x == '*' ||x == '/' ||x == '%' || x == '^'){
                String first = stack.peek();
                stack.pop();
                String second = stack.peek();
                stack.pop();
                String tmp = x + second + first;
                stack.push(tmp);
            } else {
                stack.push(x + "");
            }
        }
        System.out.println(stack.peek());
    }
}
