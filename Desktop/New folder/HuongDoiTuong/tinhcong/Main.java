package HuongDoiTuong.tinhcong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String maNV = "NV01";
        String name = scanner.nextLine();
        long luongCoBan1Ngay = scanner.nextLong();
        int soNgayCong = scanner.nextInt();
        scanner.nextLine();
        String chucVu = scanner.next();

        long luongThang = luongCoBan1Ngay*soNgayCong;

        long thuong = 0;
        if (soNgayCong < 22) {
            thuong = 0;
        } else if (soNgayCong >= 22 && soNgayCong <= 25) {
            thuong = luongThang*10/100;
        } else {
            thuong = luongThang*20/100;
        }

        long phuCap = 0;
        if (chucVu.equals("GD")) {
            phuCap = 250000;
        } else if (chucVu.equals("PGD")) {
            phuCap = 200000;
        } else if(chucVu.equals("TP")) {
            phuCap = 180000;
        } else if(chucVu.equals("NV")) {
            phuCap = 150000;
        }

        long thuNhap = phuCap+luongThang+thuong;
        NhanVien nv = new NhanVien(maNV, name, luongThang, thuong, phuCap, thuNhap);
        System.out.println(nv);
    }
}
