package NganXep;

import java.util.ArrayList;
import java.util.Scanner;

public class DaoTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLuongTest = scanner.nextInt();
        scanner.nextLine();
        while (soLuongTest --> 0) {
            String result = "";
            String input = scanner.nextLine().trim().replaceAll("\\s+", " ");
            String[] arrWords = input.split(" ");
            for (int i = 0; i < arrWords.length; i++) {
                 StringBuffer s = new StringBuffer(arrWords[i]);
                 result += s.reverse().toString()+ " ";
            }
            System.out.println(result.trim());
        }
    }
}
