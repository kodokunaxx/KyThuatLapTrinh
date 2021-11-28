package DoThi;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class DuongDiTheoDFSvoiDoThiVoHuong {
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

            dfs(dinhXuatPhat);
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

    private static void dfs(int dinhXuatPhat) {
        arrChuaXet[dinhXuatPhat] = false;
        for (int i = 0; i < arrKe[dinhXuatPhat].size(); i++) {
            int x = arrKe[dinhXuatPhat].get(i);
            if (arrChuaXet[x]) {
                dfs(x);
                arrTruoc[x] = dinhXuatPhat;
            }
        }
    }
}
