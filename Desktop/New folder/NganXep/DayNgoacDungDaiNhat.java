package NganXep;

import java.util.Scanner;
import java.util.Stack;

public class DayNgoacDungDaiNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLuongTest = Integer.parseInt(scanner.nextLine());
        while (soLuongTest --> 0) {
            String s = scanner.nextLine();
            System.out.println(tinhDoDai(s));
        }
    }

    private static int tinhDoDai(String s) {
        int doDai = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (!stack.isEmpty()) {
                    doDai = Math.max(doDai, i - stack.peek());
                } else stack.push(i);
            }
        }
        return doDai;
    }
}
