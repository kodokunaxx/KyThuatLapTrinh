package LapTrinhCoBan;

import java.util.ArrayList;
import java.util.Scanner;

public class SapXepChon_LKNguoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arrNumber = new int[size];
        for (int i = 0; i < size; i++) {
            arrNumber[i] = scanner.nextInt();
        }
        sapXepChon(arrNumber);
    }

    private static void sapXepChon(int[] arrNumber) {
        ArrayList<String> arrNguoc = new ArrayList<>();

        for (int i = 0; i < arrNumber.length - 1; i++) {
            int min = i;
            String sNumber = "";
            for (int j = i + 1; j < arrNumber.length; j++) {
                if (arrNumber[j] < arrNumber[min]) {
                    min = j;
                }
            }

            int temp = arrNumber[min];
            arrNumber[min] = arrNumber[i];
            arrNumber[i] = temp;

            for (int j = 0; j < arrNumber.length; j++) {
                sNumber += arrNumber[j] + " ";
            }
            arrNguoc.add(sNumber);
        }


        for (int j = arrNguoc.size()-1; j >= 0; j--) {
            System.out.println("Buoc " + (j+1) + ": " +arrNguoc.get(j));
        }
    }
}
