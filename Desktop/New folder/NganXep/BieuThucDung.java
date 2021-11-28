package NganXep;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BieuThucDung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soTest = Integer.parseInt(scanner.nextLine());
        while (soTest --> 0) {
            char[] arrInput = scanner.nextLine().toCharArray();
            check(arrInput);
        }
    }

    private static void check(char[] arrInput) {
        ArrayList<Integer> lmao = new ArrayList<>();

        for (int i = 0; i < arrInput.length; i++) {
            if (arrInput[i] == '[') lmao.add(i);
        }
        int result = 0, temp = -1, dem = 0;
        for (int i = 0; i < arrInput.length; i++) {
            if (arrInput[i] == '[') {
                dem++;
                temp++;
            } else {
                dem--;
            }

            if (dem < 0) {
                result += lmao.get(temp+1) - i;
                int tmp = arrInput[lmao.get(temp+1)];
                arrInput[lmao.get(temp+1)] = arrInput[i];
                arrInput[i] =arrInput[lmao.get(temp+1)];
                temp++;
                dem = 1;
            }
        }
        System.out.println(result);
    }
}
