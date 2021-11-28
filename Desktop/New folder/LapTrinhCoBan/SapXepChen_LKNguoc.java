package LapTrinhCoBan;

import java.util.ArrayList;
import java.util.Scanner;

public class SapXepChen_LKNguoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arrNumber = new int[size];
        int[] arrTMP = new int[size];
        ArrayList<String> arrNguoc = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            arrNumber[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if (i == 0) {
                arrTMP[i] = arrNumber[i];
            } else {
                int j = 0;
                while (j < i && arrTMP[j] <= arrNumber[i]) {
                    j++;
                }
                for (int k = i; k > j ; k--) {
                    arrTMP[k] = arrTMP[k-1];
                }
                arrTMP[j] = arrNumber[i];
            }

            String arrResult = "";
            for (int j = 0; j <= i; j++) {
                arrResult += (arrTMP[j] +" ");
            }
            arrNguoc.add(arrResult);
        }

        for (int i = arrNguoc.size()-1; i >= 0 ; i--) {
            System.out.println("Buoc " +i+ ": " +arrNguoc.get(i));
        }
    }
}
