package HangDoi;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SolocPhatDoiXungChan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soTest = Integer.parseInt(scanner.nextLine());
        while (soTest --> 0) {
            int soLuong = scanner.nextInt();
            soLocPhat(soLuong);
        }
    }

    private static void soLocPhat(int soLuong) {
        Queue<String> queue = new LinkedList<>();
        queue.add("6");
        queue.add("8");
        ArrayList<BigInteger> arrResult = new ArrayList<>();

        while (soLuong --> 0) {
            StringBuilder result = new StringBuilder(queue.poll());
            queue.add(result + "6");
            queue.add(result + "8");

            String tmp = result+"";
            String reverse = result.reverse() + "";
            arrResult.add(new BigInteger(tmp+reverse));
        }

        for (int i = 0; i < arrResult.size(); i++) {
            System.out.print(arrResult.get(i) + " ");
        }
        System.out.println();
    }
}
