package NganXep;

import java.util.Scanner;
import java.util.Stack;

public class TinhGiaTriBieuThucTienTo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soTest =Integer.parseInt(scanner.nextLine());
        while (soTest --> 0) {
            char[] tienTo = scanner.nextLine().toCharArray();
            tinh(tienTo);
        }
    }

    private static void tinh(char[] tienTo) {
        Stack<Long> stack = new Stack<>();
        for (int i = tienTo.length-1; i >= 0 ; i--) {
            char x = tienTo[i];
            if (x == '+' || x == '-' ||x == '*' ||x == '/' ||x == '%' ||x == '^') {
                long result = 0;
                long a = stack.peek();
                stack.pop();
                long b = stack.peek();
                stack.pop();
                if (x == '+') result = b + a;
                else  if (x == '-') result = a-b;
                else  if (x == '*') result = b * a;
                else  if (x == '/') result = a / b;
                else  if (x == '%') result = a % b;
                else  if (x == '^') {
                    long temp  = b;
                    for (int j = 0; j < b; j++) {
                        temp *= b;
                    }
                    result = temp;
                }
                stack.push(result);
            } else {
                stack.push(Long.parseLong(String.valueOf(x)));
            }
        }

        System.out.println(stack.peek());
    }
}
