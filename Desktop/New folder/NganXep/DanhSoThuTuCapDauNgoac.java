package NganXep;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class DanhSoThuTuCapDauNgoac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soTest = Integer.parseInt(scanner.nextLine());
        while (soTest --> 0) {
            String s = scanner.nextLine();
            ArrayList<Integer> arrViTri = new ArrayList<>();
            Stack<Integer> stack = new Stack<>();
            int viTri = 1;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '('){
                    stack.push(viTri);
                    arrViTri.add(viTri);
                    viTri++;
                }
                else if (s.charAt(i) == ')') {
                    arrViTri.add(stack.peek());
                    stack.pop();
                }
            }

            for (int i = 0; i < arrViTri.size(); i++) {
                System.out.print(arrViTri.get(i) + " ");
            }
            System.out.println();
        }
    }
}
