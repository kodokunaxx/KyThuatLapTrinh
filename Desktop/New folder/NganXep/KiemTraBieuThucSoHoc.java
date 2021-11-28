package NganXep;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraBieuThucSoHoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soTest = Integer.parseInt(scanner.nextLine());
        while (soTest --> 0) {
            String input = scanner.nextLine();
            if (check(input)) System.out.println("Yes");
            else System.out.println("No");
        }
    }

    private static boolean check(String input) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char sign = input.charAt(i);
            if (sign == '(') stack.push(i);
            else if (sign == ')'){
                int positionTop = stack.peek();
                stack.pop();
                if (i - positionTop == 2) return true;
                if (input.charAt(positionTop+1) == '(' && input.charAt(i-1) == ')') return true;
            }
        }
        return false;
    }
}
