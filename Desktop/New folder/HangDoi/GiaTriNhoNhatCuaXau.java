package HangDoi;

import java.util.*;

public class GiaTriNhoNhatCuaXau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soTest = Integer.parseInt(scanner.nextLine());
        while (soTest-- > 0) {
            int soKiTuBoDi = scanner.nextInt();
            String s = scanner.next();
            giaTriNhoNhat(s, soKiTuBoDi);
        }
    }

    private static void giaTriNhoNhat(String s, int soKiTuBoDi) {
        int[] arrInput = new int[27];
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> arrSapXep = new ArrayList<>();

        for (int i = 0; i < 27; i++) {
            arrInput[i] = 0;
        }

        for (int i = 0; i < s.length(); i++) {
            arrInput[s.charAt(i) - 'A']++;
        }

        for (int i = 0; i < arrInput.length; i++) {
            if (arrInput[i] > 0) arrSapXep.add(arrInput[i]);
        }

        Collections.sort(arrSapXep);
        for (int i = arrSapXep.size() - 1; i >= 0; i--) {
            queue.add(arrSapXep.get(i));
        }

        while (queue.size() > 0) {
            int max = queue.poll();
            if (soKiTuBoDi <= max) {
                queue.add(max - soKiTuBoDi);
                break;
            } else {
                soKiTuBoDi = soKiTuBoDi - max;
            }
        }

        int sum = 0;

        while (queue.size()>0) {
            int k = queue.poll();
            sum += k*k;
        }

        System.out.println(sum);
    }
}

