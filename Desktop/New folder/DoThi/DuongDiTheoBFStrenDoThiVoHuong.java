package DoThi;

import java.util.*;

public class DuongDiTheoBFStrenDoThiVoHuong {
    static ArrayList<Integer>[] arrKe;
    static boolean[] arrChuaXet;
    static int[] arrTruoc;
    static ArrayList<Integer> arrInput;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soTest = Integer.parseInt(scanner.nextLine());
        while (soTest --> 0) {
            int soDinh = Integer.parseInt(scanner.next());
            int soCanh = Integer.parseInt(scanner.next());
            int dinhXuatPhat = Integer.parseInt(scanner.next());
            int dinhCuoi = scanner.nextInt();
            scanner.nextLine();
            arrInput = new ArrayList<>();
            arrKe = new ArrayList[soDinh+1];
            arrChuaXet = new boolean[soDinh+1];
            arrTruoc = new int[soDinh+1];

            for (int i = 0; i < soDinh +1 ; i++) {
                arrChuaXet[i] = true;
                arrKe[i] = new ArrayList<>();
                arrTruoc[i] = 0;
            }

            String[] arrInputTMP = scanner.nextLine().trim().split(" ");
            int position = 0;
            for (int i = 1; i <=soCanh ; i++) {
                int begin = Integer.parseInt(arrInputTMP[position]);
                int end = Integer.parseInt(arrInputTMP[position+1]);
                arrKe[begin].add(end);
                arrKe[end].add(begin);
                position+=2;
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

                while (!stack.empty()) {
                    arrResult.add(stack.peek());
                    stack.pop();
                }
                for (int i = 0; i < arrResult.size(); i++) {
                    if (i == arrResult.size()-1)
                        System.out.print(arrResult.get(i));
                    else
                        System.out.print(arrResult.get(i) + " ");
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
                int lmao = arrKe[k].get(i);
                if (arrChuaXet[lmao]) {
                    queue.add(lmao);
                    arrChuaXet[lmao] = false;
                    arrTruoc[lmao] = k;
                }
            }
        }
    }
}
