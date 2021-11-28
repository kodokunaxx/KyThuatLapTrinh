package LapTrinhCoBan;

import java.util.ArrayList;
import java.util.Scanner;

public class RutGonXauKiTu2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] arrInput = scanner.nextLine().trim().toLowerCase().replaceAll("\\s+", "").toCharArray();
        ArrayList<Character> arrConvert = new ArrayList<>();
        ArrayList<Character> arrResult = new ArrayList<>();
        
        for (int i = 0; i < arrInput.length; i++) {
            arrConvert.add(arrInput[i]);
        }
        
        arrResult.add(arrConvert.get(0));
        for (int i = 1; i < arrConvert.size(); i++) {
            if (arrResult.size() == 0) {
                arrResult.add(arrConvert.get(i));
            } else if (arrResult.get(arrResult.size()-1) == arrConvert.get(i)){
                arrResult.remove(arrResult.size()-1);
            } else {
                arrResult.add(arrConvert.get(i));
            }
        }
        String result = "";
        for (int i = 0; i < arrResult.size(); i++) {
            result += arrResult.get(i)+"";
        }
        if (result.isEmpty()) {
            System.out.println("Empty String");
        } else {
            System.out.println(result);
        }
    }
}
