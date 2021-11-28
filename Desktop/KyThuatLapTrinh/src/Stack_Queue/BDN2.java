package Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BDN2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soTest = Integer.parseInt(scanner.nextLine());
        while (soTest --> 0) {
            long n = scanner.nextLong();
            soBDN2(n);
        }
    }

    private static void soBDN2(long n) {
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        String lmao = "";
        while (true) {
            lmao = queue.poll();
            if (Long.parseLong(lmao) % n == 0) break;
            queue.add(lmao + "0");
            queue.add(lmao + "1");
        }
        System.out.println(lmao);
    }
}
