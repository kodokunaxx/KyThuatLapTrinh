package LapTrinhCoBan;

import java.util.Scanner;

public class XauNhiPhanKeTiep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLuongTest = scanner.nextInt();
        scanner.nextLine();

        while (soLuongTest --> 0) {
            char[] n = scanner.nextLine().toCharArray();
            for (int i = n.length -1; i >= 0 ; i--) {
                if (n[i] == '0') {
                    n[i] = '1';
                    break;
                } else {
                    n[i] = '0';
                }
            }
            for (int i = 0; i < n.length; i++) {
                System.out.print(n[i] +"");
            }
            System.out.println("\n");
        }
    }
}
