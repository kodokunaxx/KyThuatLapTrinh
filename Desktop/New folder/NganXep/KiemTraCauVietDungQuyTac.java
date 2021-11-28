package NganXep;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraCauVietDungQuyTac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLuongTest = Integer.parseInt(scanner.nextLine());
        while (soLuongTest --> 0) {
            String s = scanner.nextLine();
            String ngoac = "";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == ']' || s.charAt(i) == ')') {
                    ngoac += s.charAt(i);
                }
            }
            if (check(ngoac)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    private static boolean check(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char out = s.charAt(i);
            if (out == '['  || out == '('){
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) return false;
                char in = stack.peek();
                if (in =='(' && out == ')') stack.pop();
                else if (in =='[' && out == ']') stack.pop();
                else return false;
            }
        }
        return stack.isEmpty();
    }
}
