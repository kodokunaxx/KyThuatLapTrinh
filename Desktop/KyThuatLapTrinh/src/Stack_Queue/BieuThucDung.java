package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class BieuThucDung {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());

        while (t-- > 0) {
            int m = 0;
            String str = in.nextLine();
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == '[' || stack.isEmpty()) {
                    stack.push(c);
                } else {
                    char top = stack.pop();
                    if (top != '[' || c != ']') {
                        stack.push(top);
                        stack.push(c);
                    }
                }
            }
            int n = stack.size();
            while (!stack.isEmpty() && stack.pop() == '[') {
                m++;
            }
            System.out.println(n / 2 + m % 2);
        }

    }
}