package HuongDoiTuong.tinhluong;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soPhongBan = Integer.parseInt(scanner.nextLine());
        ArrayList<NhanVien> arrPB = new ArrayList<>();
        while (soPhongBan --> 0) {
            String maPB = scanner.next().toUpperCase(Locale.ROOT).trim();
            String tenPB = scanner.nextLine();

            arrPB.add(new NhanVien(maPB, tenPB));
        }

        int soNhanVien = Integer.parseInt(scanner.nextLine());
        ArrayList<NhanVien> arrNV = new ArrayList<>();
        while (soNhanVien --> 0) {
            String maNV = scanner.nextLine();
            String tenNV = scanner.nextLine();
            long luongCoBan = Long.parseLong(scanner.nextLine());
            int soNgayCong = Integer.parseInt(scanner.nextLine());

            arrNV.add(new NhanVien(maNV, tenNV, luongCoBan, soNgayCong));
        }

        ArrayList<NhanVien> arrResult = new ArrayList<>();
        for (int i = 0; i < arrNV.size(); i++) {
            char nhom =arrNV.get(i).getMa().trim().toUpperCase(Locale.ROOT).charAt(0);
            int soNamCongTac = Integer.parseInt(arrNV.get(i).getMa().trim().substring(1,3));
            String maPB = arrNV.get(i).getMa().trim().substring(3);
            String ma = arrNV.get(i).getMa();
            String name = arrNV.get(i).getTen();
            int soNgayCong = arrNV.get(i).getSoNgayCong();
            long luongCoBan = arrNV.get(i).getLuongCoBan();

            int heSoLuong = 0;
            String tenPB = "";

            switch (nhom) {
                case 'A':
                    if (soNamCongTac >= 1 && soNamCongTac <= 3) heSoLuong = 10;
                    else if (soNamCongTac >= 4 && soNamCongTac <= 8) heSoLuong = 12;
                    else if (soNamCongTac >= 9 && soNamCongTac <=15) heSoLuong = 14;
                    else if (soNamCongTac >= 16) heSoLuong = 20;
                    break;
                case 'B':
                    if (soNamCongTac >= 1 && soNamCongTac <= 3) heSoLuong = 10;
                    else if (soNamCongTac >= 4 && soNamCongTac <= 8) heSoLuong = 11;
                    else if (soNamCongTac >= 9 && soNamCongTac <=15) heSoLuong = 13;
                    else if (soNamCongTac >= 16) heSoLuong = 16;
                    break;
                case 'C':
                    if (soNamCongTac >= 1 && soNamCongTac <= 3) heSoLuong = 9;
                    else if (soNamCongTac >= 4 && soNamCongTac <= 8) heSoLuong = 10;
                    else if (soNamCongTac >= 9 && soNamCongTac <=15) heSoLuong = 12;
                    else if (soNamCongTac >= 16) heSoLuong = 14;
                    break;
                case 'D':
                    if (soNamCongTac >= 1 && soNamCongTac <= 3) heSoLuong = 8;
                    else if (soNamCongTac >= 4 && soNamCongTac <= 8) heSoLuong = 9;
                    else if (soNamCongTac >= 9 && soNamCongTac <=15) heSoLuong = 11;
                    else if (soNamCongTac >= 16)  heSoLuong = 13;
                    break;
                default:
                    break;
            }

            long luongThang = luongCoBan*soNgayCong*heSoLuong;
            for (int j = 0; j < arrPB.size(); j++) {
                if (arrPB.get(j).getMaPB().equalsIgnoreCase(maPB) == true) {
                    tenPB = arrPB.get(j).getTenPB();
                    break;
                }
            }

            arrResult.add(new NhanVien(ma, name, tenPB, luongThang));
        }

        for (int i = 0; i < arrResult.size(); i++) {
            System.out.println(arrResult.get(i));
        }
    }
}
