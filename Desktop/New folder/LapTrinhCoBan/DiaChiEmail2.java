package LapTrinhCoBan;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class DiaChiEmail2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLuongTest = scanner.nextInt();
        scanner.nextLine();
        ArrayList<String> arrInput = new ArrayList<>();
        while (soLuongTest --> 0) {
            String name = scanner.nextLine();
            arrInput.add(name.trim().replaceAll("\\s+", " ").toLowerCase(Locale.ROOT));
        }

        ArrayList<String> arrNameSholved = new ArrayList<>();
        for (int i = 0; i < arrInput.size(); i++) {
            String[] arrNameTrim = arrInput.get(i).split(" ");
            String s  = arrNameTrim[arrNameTrim.length-1];
            for (int j = 0; j < arrNameTrim.length-1; j++) {
                s += arrNameTrim[j].charAt(0);
            }
            arrNameSholved.add(s);
        }

        for (int i = 0; i < arrNameSholved.size(); i++) {
            int checkRepeat = 1;
            for (int j = i-1; j >= 0 ; j--) {
                if (arrNameSholved.get(i).equals(arrNameSholved.get(j))) {
                    checkRepeat ++;
                }
            }
            if (checkRepeat == 1) {
                System.out.println(arrNameSholved.get(i) +"@ptit.edu.vn");
            } else {
                System.out.println(arrNameSholved.get(i) +""+ checkRepeat+"@ptit.edu.vn");
            }
        }
    }
}
