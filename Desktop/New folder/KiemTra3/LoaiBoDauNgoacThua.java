package KiemTra3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class LoaiBoDauNgoacThua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soTest = Integer.parseInt(scanner.nextLine());
        ArrayList<String> lmao = new ArrayList<>();
        while (soTest-- > 0) {
            lmao.add(scanner.nextLine().trim().replaceAll("\\s+", ""));
        }
        solve(lmao);
    }

    private static void solve(ArrayList<String> lmao) {
        for (int k = 0; k < lmao.size(); k++) {
            char[] arrInput = lmao.get(k).toCharArray();
            Stack<Integer> stackOpen = new Stack<>();
            ArrayList<Integer> arrOperator = new ArrayList<>();

            for (int i = 0; i < arrInput.length; i++) {
                if (arrInput[i] == '(') stackOpen.push(i);
                else if (arrInput[i] == ')') {
                    if (stackOpen.peek() == 0) {
                        arrOperator.add(stackOpen.peek());
                        arrOperator.add(i);
                        stackOpen.pop();
                    } else if (arrInput[stackOpen.peek() + 1] == '(' && arrInput[i - 1] == ')') {
                        arrOperator.add(stackOpen.peek());
                        arrOperator.add(i);
                        stackOpen.pop();
                    } else if (arrInput[stackOpen.peek() - 1] == '+') {
                        arrOperator.add(stackOpen.peek());
                        arrOperator.add(i);
                        stackOpen.pop();
                    } else if (i - stackOpen.peek() == 2) {
                        arrOperator.add(stackOpen.peek());
                        arrOperator.add(i);
                        stackOpen.pop();
                    } else if (arrInput[stackOpen.peek() - 1] == '-') stackOpen.pop();
                    else stackOpen.pop();
                }
            }



            Collections.sort(arrOperator);
            if (arrOperator.size() > 0) {
                String result = "";
                for (int i = 0; i < arrInput.length; i++) {
                    int count = 0;
                    for (int j = 0; j < arrOperator.size(); j++) {
                        if (i == arrOperator.get(j)) {
                            count++;
                            break;
                        }
                    }
                    if (count == 0) result += arrInput[i];
                }
                System.out.println(result);
            } else System.out.println(lmao.get(k));
        }
    }
}
