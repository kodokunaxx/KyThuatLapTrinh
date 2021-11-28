package LapTrinhCoBan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SapXepDoiChoTrucTiep_LKNguoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLuongTest = scanner.nextInt();
        while (soLuongTest-- > 0) {
            int size = scanner.nextInt();
            int[] arrNumber = new int[size];
            ArrayList<String> arrStepNguoc = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                arrNumber[i] = scanner.nextInt();
            }

            for (int i = 0; i < arrNumber.length - 1; i++) {
                String sNumber = "";
                for (int j = i + 1; j < arrNumber.length; j++) {
                    if (arrNumber[i] > arrNumber[j]) {
                        int temp = arrNumber[i];
                        arrNumber[i] = arrNumber[j];
                        arrNumber[j] = temp;
                    }
                }

                for (int j = 0; j < arrNumber.length; j++) {
                    sNumber += arrNumber[j] + " ";
                }

                arrStepNguoc.add(sNumber.trim());
            }

            for (int i = arrStepNguoc.size() - 1; i >= 0; i--) {
                System.out.println("Buoc " + (i + 1) + ": " + arrStepNguoc.get(i));
            }
        }
    }
}
