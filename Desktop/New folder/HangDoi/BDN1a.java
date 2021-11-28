package HangDoi;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BDN1a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soTest = Integer.parseInt(scanner.nextLine());
        while (soTest --> 0) {
            long limit = scanner.nextInt();
            soBDN(limit);
        }
    }

    private static void soBDN(long limit) {
        int result = 0;
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        while (true) {
            String lmao = queue.poll();
            System.out.print(lmao + " ");
            if (Long.parseLong(lmao) >limit) break;
            queue.add(lmao + "0");
            queue.add(lmao + "1");
            result ++;
        }

        System.out.println(result);
    }
}
