package NganXep;

import java.util.Scanner;
import java.util.Stack;

public class SuaLaiDayNgoac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLuongTest = scanner.nextInt();
        scanner.nextLine();
        while (soLuongTest --> 0) {
            char[] arrNgoac = scanner.nextLine().toCharArray();
            Stack<Character> falseSign = new Stack<>();
            for (int i = 0; i < arrNgoac.length; i++) {
                if (arrNgoac[i] == '(' || (arrNgoac[i] == ')' && falseSign.size() == 0)) {
                    falseSign.push(arrNgoac[i]);
                } else if (arrNgoac[i] == ')') {
                    if (falseSign.size() > 0 && falseSign.peek() == '(') {
                        falseSign.pop();
                    } else {
                        falseSign.push(arrNgoac[i]);
                    }
                }
            }

            int d1 = 0, d2 = 0;
            while (falseSign.size() >0) {
                if (falseSign.peek() == '(') {
                    d1++;
                } else {
                    d2++;
                }
                falseSign.pop();
            }
            int res = d1/2 + d2/2 +d1%2 +d2%2;
            System.out.println(res);
        }
    }
}
