package HuongDoiTuong.lophocphan1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soLopHocPhan = Integer.parseInt(scanner.nextLine());
        ArrayList<HocPhan> arrHP = new ArrayList<>();
        for (int i = 0; i < soLopHocPhan; i++) {
            String maHP = scanner.nextLine();
            String tenHP = scanner.nextLine();
            String nhom = scanner.nextLine();
            String giangVien = scanner.nextLine();

            HocPhan hp = new HocPhan(maHP, tenHP, nhom, giangVien);
            arrHP.add(hp);
        }
        int soMon = Integer.parseInt(scanner.nextLine());

        Collections.sort(arrHP);
        for (int i = 0; i < soMon; i++) {
            String maMon = scanner.nextLine();
            String tenMon = "";
            for (int j = 0; j < arrHP.size(); j++) {
                if (maMon.equalsIgnoreCase(arrHP.get(j).getMaMonHoc()) == true) {
                    tenMon = arrHP.get(j).getName();
                    break;
                }
            }
            System.out.println("Danh sach nhom lop mon " +tenMon +": ");
            for (int k = 0; k < arrHP.size(); k++) {
                if (maMon.equalsIgnoreCase(arrHP.get(k).getMaMonHoc()) == true){
                    System.out.println(arrHP.get(k));
                }
            }
        }
    }
}
