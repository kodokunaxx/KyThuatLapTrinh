package LapTrinhCoBan;

import java.util.Arrays;
import java.util.Scanner;

public class DanhDauChuCai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] s = scanner.nextLine().toCharArray();
        Arrays.sort(s);
        int sum = 1;

        for (int i = 0; i < s.length-1; i++) {
           if (s[i] != s[i+1]){
               sum ++;
           }
        }

        System.out.println(sum);
    }
}
