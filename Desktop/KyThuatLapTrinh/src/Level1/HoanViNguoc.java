package Level1;

import java.util.ArrayList;
import java.util.Scanner;

public class HoanViNguoc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int[] permutation = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                permutation[i] = i;
            }
            ArrayList<String> result = genPermutation(permutation);
            for(int i = result.size() - 1; i >= 0; i--) {
                System.out.print(result.get(i) + " ");
            }
            System.out.println("");
        }
    }

    public static ArrayList<String> genPermutation(int[] permutation) {
        int n = permutation.length - 1;
        ArrayList<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            sb.append(i + "");
        }
        result.add(sb.toString());

        while (true) {
            int index = n;
            while (index > 1 && permutation[index] < permutation[index - 1]) {
                index--;
            }
            if (index == 1) {
                break;
            }
            int left = index, right = n;
            for (int i = n; i >= index; i--) {
                if (permutation[index - 1] < permutation[i]) {
                    int tmp = permutation[i];
                    permutation[i] = permutation[index - 1];
                    permutation[index - 1] = tmp;
                    break;
                }
            }
            while (left < right) {
                int tmp = permutation[left];
                permutation[left] = permutation[right];
                permutation[right] = tmp;
                right--;
                left++;
            }
            StringBuilder sbTmp = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                sbTmp.append(permutation[i] + "");
            }
            result.add(sbTmp.toString());
        }
        return result;
    }
}
