package NganXep;

import java.util.Scanner;
import java.util.Stack;

public class DaoTu2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soTest = Integer.parseInt(scanner.nextLine());
        while (soTest --> 0) {
            String[] s = scanner.nextLine().split("\\s+");

            for (int i = 0; i < s.length; i++) {
                Stack<Character> stack = new Stack<>();
                for (int j = 0; j < s[i].length(); j++) {
                    stack.push(s[i].charAt(j));
                }
                while (!stack.isEmpty()) {
                    System.out.print(stack.peek());
                    stack.pop();
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
