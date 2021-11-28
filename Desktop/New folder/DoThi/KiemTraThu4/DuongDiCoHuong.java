package KiemTraThu4;

import java.util.*;

public class DuongDiCoHuong {
    static ArrayList<Integer>[] arrKe;
    static boolean[] arrChuaXet;
    static int arrTruoc[];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soTest = Integer.parseInt(scanner.nextLine());
        while (soTest --> 0) {
            int soDinh = Integer.parseInt(scanner.next());
            int soCanh = Integer.parseInt(scanner.next());
            int dinhXuatPhat =  Integer.parseInt(scanner.next());
            int dinhCuoi = scanner.nextInt();
            arrTruoc = new int[soDinh+1];
            arrKe = new ArrayList[soDinh+1];
            arrChuaXet = new boolean[soDinh+1];

            for (int i = 0; i < arrChuaXet.length; i++) {
                arrKe[i] = new ArrayList<>();
                arrChuaXet[i] = true;
                arrTruoc[i] = 0;
            }

            for (int i = 1; i <= soCanh ; i++) {
                int begin = Integer.parseInt(scanner.next());
                int end = scanner.nextInt();

                arrKe[begin].add(end);
            }

            bfs(dinhXuatPhat);
            if (arrChuaXet[dinhCuoi]) System.out.println(-1);
            else {
                ArrayList<Integer> arrResult = new ArrayList<>();
                Stack<Integer> stack = new Stack<>();
                stack.push(dinhCuoi);
                while (stack.peek() != dinhXuatPhat) {
                    stack.push(arrTruoc[stack.peek()]);
                }

                while (!stack.isEmpty()) {
                    arrResult.add(stack.peek());
                    stack.pop();
                }

                for (int i = 0; i < arrResult.size(); i++) {
                    if (i == arrResult.size()-1) System.out.print(arrResult.get(i));
                    else System.out.print(arrResult.get(i) + " -> ");
                }
                System.out.println();
            }
        }
    }

    private static void bfs(int dinhXuatPhat) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(dinhXuatPhat);
        arrChuaXet[dinhXuatPhat] = false;

        while (!queue.isEmpty()) {
            int k = queue.poll();
            for (int i = 0; i < arrKe[k].size(); i++) {
                int x = arrKe[k].get(i);
                if (arrChuaXet[x]) {
                    queue.add(x);
                    arrChuaXet[x] = false;
                    arrTruoc[x] = k;
                }
            }
        }
    }
}
