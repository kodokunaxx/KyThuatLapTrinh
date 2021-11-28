package HangDoi;

import java.util.*;

public class GiaTriNhoNhatCuaXau2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soTest = Integer.parseInt(scanner.nextLine());
        while (soTest-- > 0) {
            int soKiTuBoDi = Integer.parseInt(scanner.nextLine());
            String s = scanner.nextLine();
            if (soKiTuBoDi >= s.length()) System.out.println(0);
            else giaTriNhoNhat(s, soKiTuBoDi);
        }
    }

    private static void giaTriNhoNhat(String s, int soKiTuBoDi) {
        ArrayList<Character>arrInput = new ArrayList();
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> arrSapXep = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            arrInput.add(s.charAt(i));
        }
        Collections.sort(arrInput);
        int count = 1;
        char temp = arrInput.get(0);
        for (int i = 1; i < arrInput.size(); i++) {
            if (temp != arrInput.get(i)) {
                temp = arrInput.get(i);
                arrSapXep.add(count);
                count = 1;
            } else {
                count++;
            }
        }
        arrSapXep.add(count);

        Collections.sort(arrSapXep);
        for (int i = arrSapXep.size() - 1; i >= 0; i--) {
            queue.add(arrSapXep.get(i));
        }

        while (!queue.isEmpty()) {
            int max = queue.poll();
            if (soKiTuBoDi < max) {
                queue.add(max - soKiTuBoDi);
                break;
            } else {
                soKiTuBoDi = soKiTuBoDi - max;
            }
        }

        long sum = 0;

        while (!queue.isEmpty()) {
            long k = queue.poll();
            sum += k * k;
        }

        System.out.println(sum);
    }
}
