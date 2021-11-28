package NganXep;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraDayNgoacDung {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int soLuongTest = Integer.parseInt(scanner.nextLine());
            while (soLuongTest --> 0) {
                String s = scanner.nextLine();
                if (kiemTra(s)) System.out.println("YES");
                else System.out.println("NO");
            }
        }

    private static boolean kiemTra(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char out = s.charAt(i);
            if (out == '[' || out == '(' || out == '{' ) {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) return false;
                char in = stack.peek();
                if (in == '(' && out == ')') stack.pop();
                else if (in == '[' && out == ']') stack.pop();
                else if (in == '{' && out == '}') stack.pop();
                else return false;
            }
        }
        return stack.isEmpty();
    }
}
