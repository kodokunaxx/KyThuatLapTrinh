package LapTrinhCoBan;

import java.util.ArrayList;
import java.util.Scanner;

public class ChuanHoaHoTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLuongTest = scanner.nextInt();
        scanner.nextLine();
        while (soLuongTest --> 0) {
            String name = scanner.nextLine();
            name = name.trim().replaceAll("\\s+", " ").toLowerCase();
            String[] arrWords = name.split(" ");

            String word = "";

            for (int i = 0; i < arrWords.length; i++) {
                word += String.valueOf(arrWords[i].charAt(0)).toUpperCase() + arrWords[i].substring(1);
                if (i != arrWords.length-1) {
                    word += " ";
                }
            }

            System.out.println(word.trim());
        }
    }
}
