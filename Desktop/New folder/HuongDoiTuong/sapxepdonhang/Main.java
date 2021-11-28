package HuongDoiTuong.sapxepdonhang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLuongDonHang = Integer.parseInt(scanner.nextLine());
        ArrayList<DonHang> arrDH = new ArrayList<>();

        while (soLuongDonHang --> 0) {
            String name = scanner.nextLine();
            String maDonHang = scanner.nextLine();
            long donGia = Long.parseLong(scanner.nextLine());
            int soLuong = Integer.parseInt(scanner.nextLine());

           arrDH.add(new DonHang(name, maDonHang, donGia, soLuong));
        }

        ArrayList<DonHang> arrResult = new ArrayList<>();
        for (int i = 0; i < arrDH.size(); i++) {
            String name  = arrDH.get(i).getName();
            String maDonHang = arrDH.get(i).getMa();
            String soTT = arrDH.get(i).getMa().substring(1,4);
            long donGia = arrDH.get(i).getDonGia();
            int soLuong = arrDH.get(i).getSoLuong();
            long giamGia = 0;

            char phanLoai = arrDH.get(i).getMa().charAt(4);

            if (phanLoai == '1') {
                giamGia = donGia*soLuong*1/2;
            } else if (phanLoai == '2'){
                giamGia = donGia*soLuong*3/10;
            }

            long thanhTien = donGia*soLuong - giamGia;

            arrResult.add(new DonHang(name, maDonHang, soTT, giamGia, thanhTien));
        }

        Collections.sort(arrResult);

        for (int i = 0; i < arrResult.size(); i++) {
            System.out.println(arrResult.get(i));
        }
    }
}
