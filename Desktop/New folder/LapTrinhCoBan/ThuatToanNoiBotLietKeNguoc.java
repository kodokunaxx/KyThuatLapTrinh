package LapTrinhCoBan;

import java.util.ArrayList;
import java.util.Scanner;

public class ThuatToanNoiBotLietKeNguoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLuongTest = scanner.nextInt();
        while (soLuongTest --> 0) {
            int soPhanTu = scanner.nextInt();
            int[] arrTest = new int[soPhanTu];
            for (int i = 0; i < soPhanTu; i++) {
                arrTest[i] = scanner.nextInt();
            }
            sapXepNoiBotLietKeNguoc(arrTest);
        }
    }

    private static void sapXepNoiBotLietKeNguoc(int[] arrTest) {
        int count = 0;
        ArrayList<String> arrNguoc = new ArrayList<>();

        for (int i = 0; i < arrTest.length-1; i++) {
            int check = 0;
            for (int j = 0; j < arrTest.length-i-1; j++) {
                if (arrTest[j] > arrTest[j + 1]) {
                    int tmp = arrTest[j];
                    arrTest[j] = arrTest[j + 1];
                    arrTest[j + 1] = tmp;
                    check ++;
                }
            }

            if (check != 0){
                String arrConvertToString = "";
                for (int k = 0; k < arrTest.length; k++) {
                    arrConvertToString += arrTest[k] + " ";
                }

                arrNguoc.add(arrConvertToString.trim());
            }
        }

        for (int i = arrNguoc.size()-1; i >= 0; i--) {
            System.out.println("Buoc " +(i+1)+ ": " +arrNguoc.get(i));
        }
    }
}
