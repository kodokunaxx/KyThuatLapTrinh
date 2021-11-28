package HangDoi;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SoNguyenThuy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soTest = Integer.parseInt(scanner.nextLine());
        while (soTest --> 0) {
            int soLuong = scanner.nextInt();
            soNguyenThuy(soLuong);
        }
    }

    private static void soNguyenThuy(int soLuong) {
        Queue<String> queue = new LinkedList<>();
        ArrayList<BigInteger> arrResult = new ArrayList<>();
        queue.add("4");
        queue.add("5");

        while (true) {
            if (arrResult.size() >= soLuong) break;
            StringBuilder lmao = new StringBuilder(queue.poll());
            String temp = String.valueOf(lmao);
            queue.add(temp + "4");
            queue.add(temp + "5");
            String reverse = String.valueOf(lmao.reverse());
            String result = temp + reverse;
            if (result.length() % 2 == 0) {
                arrResult.add(new BigInteger(result));
            }
        }

        for (int i = 0; i < arrResult.size(); i++) {
            System.out.print(arrResult.get(i) + " ");
        }
        System.out.println();
     }
}
