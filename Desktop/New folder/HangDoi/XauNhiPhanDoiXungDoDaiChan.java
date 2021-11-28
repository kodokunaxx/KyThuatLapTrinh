package HangDoi;

import java.math.BigInteger;
import java.util.*;

public class XauNhiPhanDoiXungDoDaiChan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soTest = Integer.parseInt(scanner.nextLine());
        while (soTest --> 0) {
            int n = scanner.nextInt();
            soNhiPhan(n);
        }
    }

    private static void soNhiPhan(int n) {
        Queue<String> queue = new LinkedList<>();
        queue.add("0");
        queue.add("1");
        ArrayList<String> arrResult = new ArrayList<>();

        while (true) {
            StringBuilder lmao = new StringBuilder(queue.poll());
            queue.add(lmao+ "0");
            queue.add(lmao+ "1");
            String temp = String.valueOf(lmao);
            String reverse = String.valueOf(lmao.reverse());
            String result = temp+reverse;
            if (result.length() >n) break;
            if (result.length() % 2 == 0) {
                arrResult.add(result);
            }
        }

        for (int i = 0; i < arrResult.size(); i++) {
            System.out.print(arrResult.get(i) + " ");
        }

        System.out.println();
    }
}
