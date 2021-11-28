package LapTrinhCoBan;

import java.util.ArrayList;
import java.util.Scanner;

public class DiaChiEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLuongTest = scanner.nextInt();
        scanner.nextLine();
        ArrayList<String> arrInput = new ArrayList<>(soLuongTest);

        while (soLuongTest-- > 0) {
            String name = scanner.nextLine();
            name = name.trim().replaceAll("\\s+", " ").toLowerCase();
            arrInput.add(name);
        }


        ArrayList<String> arrNameEmail = new ArrayList<>();

        for (int i = 0; i < arrInput.size(); i++) {
            String[] arrWords = arrInput.get(i).split(" ");
            String nameEmail = arrWords[arrWords.length - 1];
            for (int j = 0; j <= arrWords.length - 2; j++) {
                String part = arrWords[j].charAt(0) + "";
                nameEmail += part;
            }
            arrNameEmail.add(nameEmail);
        }

        for (int i = 0; i < arrNameEmail.size(); i++) {
            int lmao = 0;
            if (i == 0) {
                String result = arrNameEmail.get(i) + "@ptit.edu.vn";
                System.out.println(result.trim());
            } else {
                int checkRepeat = 1;
                for (int j = i - 1; j >= 0; j--) {
                    if (arrNameEmail.get(j).equals(arrNameEmail.get(i)) == true) {
                        checkRepeat++;
                    }
                }
                if (checkRepeat != 1) {
                    String result = arrNameEmail.get(i) + "" + (checkRepeat) + "@ptit.edu.vn";
                    System.out.println(result.trim());
                } else {
                    String result = arrNameEmail.get(i) + "@ptit.edu.vn";
                    System.out.println(result.trim());
                }

            }
        }
    }
}



