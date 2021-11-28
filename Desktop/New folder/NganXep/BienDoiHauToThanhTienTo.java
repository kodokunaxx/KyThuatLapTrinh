package NganXep;

import java.util.Scanner;
import java.util.Stack;

public class BienDoiHauToThanhTienTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLuongTest = scanner.nextInt();
        scanner.nextLine();
        while (soLuongTest --> 0) {
            char[] arrInput = scanner.nextLine().toCharArray();
            Stack<String> arrStack = new Stack<>();
            int length = arrInput.length -1;
            for (int i = 0; i <= length ; i++) {
                if (arrInput[i] == '+' || arrInput[i] == '-' ||
                        arrInput[i] == '/' || arrInput[i] == '*' ||
                        arrInput[i] == '^' || arrInput[i] == '%' ) {
                    String s1 = arrStack.get(arrStack.size()-1);
                    arrStack.pop();
                    String s2 = arrStack.get(arrStack.size()-1);
                    arrStack.pop();
                    String temp = arrInput[i] + s2 + s1;
                    arrStack.push(temp);
                } else {
                    arrStack.push(Character.toString(arrInput[i]));
                }
            }
            System.out.println(arrStack.get(arrStack.size()-1));
        }
    }
}
