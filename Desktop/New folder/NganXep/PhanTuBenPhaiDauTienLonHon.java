package NganXep;

import java.util.ArrayList;
import java.util.Scanner;

public class PhanTuBenPhaiDauTienLonHon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLuongTest = scanner.nextInt();
        while (soLuongTest-- > 0) {
            int size = scanner.nextInt();
            ArrayList<Integer> arrInput = new ArrayList<>();
            ArrayList<Integer> arrResult = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                arrInput.add(scanner.nextInt());
            }

            for (int i = 0; i < arrInput.size(); i++) {
                if (i == arrInput.size() - 1) {
                    arrResult.add( -1);
                } else {
                    int check = 0;
                    for (int j = i + 1; j < arrInput.size(); j++) {
                        if (arrInput.get(i) < arrInput.get(j)) {
                            arrResult.add( arrInput.get(j));
                            check++;
                            break;
                        }
                    }
                    if (check == 0) {
                        arrResult.add( -1);
                    }
                }
            }

            for (int i = 0; i < arrResult.size(); i++) {
                System.out.print(arrResult.get(i) + " ");
            }
            System.out.println();
        }
    }
}

