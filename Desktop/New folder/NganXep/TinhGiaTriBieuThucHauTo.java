package NganXep;

import java.util.Scanner;
import java.util.Stack;

public class TinhGiaTriBieuThucHauTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLuongTest = scanner.nextInt();
        scanner.nextLine();
        while (soLuongTest --> 0) {
            char[] arrInput = scanner.nextLine().toCharArray();
            Stack<Long> arrStack = new Stack<>();

            for (int i = 0; i < arrInput.length ; i++) {
                if (arrInput[i] == '+' || arrInput[i] == '-' ||
                        arrInput[i] == '/' || arrInput[i] == '*' ||
                        arrInput[i] == '^' || arrInput[i] == '%' ) {
                    long b = arrStack.get(arrStack.size()-1);
                    arrStack.pop();
                    long a = arrStack.get(arrStack.size()-1);
                    arrStack.pop();
                    long temp = 0;
                    if (arrInput[i] == '+') temp = a+b;
                    else if (arrInput[i] == '-') temp = a-b;
                    else if (arrInput[i] == '*') temp = a*b;
                    else if (arrInput[i] == '/') temp = a/b;
                    else if (arrInput[i] == '%') temp = a%b;
                    else if (arrInput[i] == '^') {
                        temp = a;
                        for (int j = 0; j < b-1; j++) {
                            temp *= b;
                        }
                    }
                    arrStack.push(temp);
                } else {

                    arrStack.push((long) arrInput[i] -'0');

                }
            }
            System.out.println(arrStack.get(arrStack.size()-1));
        }
    }
}
