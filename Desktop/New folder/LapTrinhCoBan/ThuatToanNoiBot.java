package LapTrinhCoBan;

import java.util.Scanner;

public class ThuatToanNoiBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soPhanTu = scanner.nextInt();
        int[] arrTest = new int[soPhanTu];
        for (int i = 0; i < soPhanTu; i++) {
            arrTest[i] = scanner.nextInt();
        }
        sapXepNoiBot(arrTest);
    }

    private static void sapXepNoiBot(int[] arrTest) {
        int count = 0;
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
                count++;
                System.out.print("Buoc " +count+ ": ");
                for (int k = 0; k < arrTest.length; k++) {
                    System.out.print(arrTest[k] + " ");
                }
                System.out.println("\n");
            }
        }
    }
}
