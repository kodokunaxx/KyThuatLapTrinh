package HuongDoiTuong.tinhthunhapgiaovien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String maNgach = scanner.nextLine();
        String name = scanner.nextLine();
        long luong = scanner.nextLong();

        int bacLuong = Integer.parseInt(maNgach.substring(2));
        String chucVu = maNgach.substring(0,2);
        if (chucVu.equals("HT")) {
            int troCap = 2000000;
            long thuNhap =  luong*bacLuong + troCap;
            GiaoVien giaoVien = new GiaoVien(maNgach, name,  bacLuong, troCap, thuNhap);
            System.out.println(giaoVien);
        } else if (chucVu.equals("HP")) {
            int troCap = 900000;
            long thuNhap =  luong*bacLuong + troCap;
            GiaoVien giaoVien = new GiaoVien(maNgach, name,  bacLuong, troCap, thuNhap);
            System.out.println(giaoVien);
        } else if (chucVu.equals("GV")) {
            int troCap = 500000;
            long thuNhap =  luong*bacLuong + troCap;
            GiaoVien giaoVien = new GiaoVien(maNgach, name,  bacLuong, troCap, thuNhap);
            System.out.println(giaoVien);
        }
    }
}
