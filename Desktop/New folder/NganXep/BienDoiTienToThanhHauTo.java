package NganXep;

import java.util.Scanner;
import java.util.Stack;

public class BienDoiTienToThanhHauTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLuongTest = scanner.nextInt();
        scanner.nextLine();
        while (soLuongTest --> 0) {
            char[] arrInput = scanner.nextLine().toCharArray();
            Stack<String> arrStack = new Stack<>();
            int length = arrInput.length -1;
            for (int i = length; i >= 0 ; i--) {
                if (arrInput[i] == '+' || arrInput[i] == '-' ||
                        arrInput[i] == '/' || arrInput[i] == '*' ||
                        arrInput[i] == '^' || arrInput[i] == '%' ) {
                    String s1 = arrStack.get(arrStack.size()-1);
                    arrStack.pop();
                    String s2 = arrStack.get(arrStack.size()-1);
                    arrStack.pop();
                    String temp = s1 + s2 + arrInput[i];
                    arrStack.push(temp);
                } else {
                    arrStack.push(Character.toString(arrInput[i]));
                }
            }
            System.out.println(arrStack.get(arrStack.size()-1));
        }
    }
}
