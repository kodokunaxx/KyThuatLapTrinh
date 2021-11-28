package HuongDoiTuong.bangdiemhocsinh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<HocSinh> arrHocSinh = new ArrayList<>();
        ArrayList<HocSinh> arrResult =  new ArrayList<>();
        int n  = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            HocSinh hocSinh = new HocSinh(i,scanner.nextLine(),scanner.nextFloat(), scanner.nextFloat(),scanner.nextFloat(),
                    scanner.nextFloat(),scanner.nextFloat(),scanner.nextFloat(),scanner.nextFloat(),scanner.nextFloat(),
                    scanner.nextFloat(),scanner.nextFloat());
            scanner.nextLine();
            arrHocSinh.add(hocSinh);
        }

        for (int i = 0; i < arrHocSinh.size(); i++) {
            String diemTB =  arrHocSinh.get(i).tinhDiemTB();
            if (Float.parseFloat(diemTB) >= 9) {
                String xepHang = "XUAT SAC";
                HocSinh hs = new HocSinh(arrHocSinh.get(i).getMa(), arrHocSinh.get(i).getTen(), Float.parseFloat(diemTB), xepHang);
                arrResult.add(hs);
            } else if (Float.parseFloat(diemTB) >= 8 && Float.parseFloat(diemTB) <= 8.9) {
                String xepHang = "GIOI";
                HocSinh hs = new HocSinh(arrHocSinh.get(i).getMa(), arrHocSinh.get(i).getTen(), Float.parseFloat(diemTB), xepHang);
                arrResult.add(hs);
            } else if (Float.parseFloat(diemTB) >= 7 && Float.parseFloat(diemTB) <= 7.9) {
                String xepHang = "KHA";
                HocSinh hs = new HocSinh(arrHocSinh.get(i).getMa(), arrHocSinh.get(i).getTen(), Float.parseFloat(diemTB), xepHang);
                arrResult.add(hs);
            } else if (Float.parseFloat(diemTB) >= 5 && Float.parseFloat(diemTB) <= 6.9) {
                String xepHang = "TB";
                HocSinh hs = new HocSinh(arrHocSinh.get(i).getMa(), arrHocSinh.get(i).getTen(), Float.parseFloat(diemTB), xepHang);
                arrResult.add(hs);
            } else {
                String xepHang = "YEU";
                HocSinh hs = new HocSinh(arrHocSinh.get(i).getMa(), arrHocSinh.get(i).getTen(), Float.parseFloat(diemTB), xepHang);
                arrResult.add(hs);
            }
        }
        Collections.sort(arrResult);
        for (int i = arrResult.size()-1; i >= 0; i--) {
            System.out.println(arrResult.get(i));
        }
    }
}
