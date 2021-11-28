package HangDoi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SoNhiPhanTu1DenN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soTest = Integer.parseInt(scanner.nextLine());
        while (soTest --> 0) {
            int n = scanner.nextInt();
            nSoNhiPhan(n);
        }
    }

    private static void nSoNhiPhan(int n) {
        Queue<String> queue = new LinkedList<>();

        queue.add("1");
        while (n --> 0) {
            String result = queue.poll();
            System.out.print(result+ " ");
            queue.add(result + "0");
            queue.add(result + "1");
        }
        System.out.println();
    }
}
