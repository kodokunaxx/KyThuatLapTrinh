package KiemTra3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class So2UuThe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soTest = Integer.parseInt(scanner.nextLine());
        while (soTest --> 0) {
            int soLuong = scanner.nextInt();
            soTamPhan(soLuong);
        }
    }

    private static void soTamPhan(int soLuong) {
        Queue<String> queue = new LinkedList<>();
        ArrayList<BigInteger> arrResult = new ArrayList<>();
        arrResult.add(new BigInteger(2 + ""));
        queue.add("1");
        queue.add("2");
        while (arrResult.size() <= soLuong) {
            String k = queue.poll();
            if (checkTamPhan(k) && (arrResult.get(arrResult.size()-1).compareTo(new BigInteger(k)) != 0) ) arrResult.add(new BigInteger(k));
            queue.add(k+"0");
            queue.add(k+"1");
            queue.add(k+"2");
        }

        for (int i = 0; i < arrResult.size()-1; i++) {
            System.out.print(arrResult.get(i) + " ");
        }
        System.out.println();
    }

    private static boolean checkTamPhan(String k) {
        int count = 0;
        for (int i = 0; i < k.length(); i++) {
            if (k.charAt(i) == '2') count++;
        }
        if (count > (k.length()/2)) return true;
        return false;
    }
}
