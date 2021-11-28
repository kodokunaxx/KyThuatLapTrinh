package HuongDoiTuong.sapxepdanhsachdoituongnhanvien2;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int soNV = Integer.parseInt(scanner.nextLine());
        ArrayList<NhanVien> arrNV = new ArrayList<>();

        for (int i = 1; i <= soNV; i++) {
            int ma = i;
            String name = scanner.nextLine();
            String sex = scanner.nextLine();
            String ngaySinh = scanner.nextLine();
            String address = scanner.nextLine();
            String maSoThue =scanner.nextLine();
            String ngayKiHopDong =scanner.nextLine();
            NhanVien nv = new NhanVien(ma, name,sex, ngaySinh, address, maSoThue, ngayKiHopDong);
            arrNV.add(nv);
        }
        Collections.sort(arrNV);

        for (int i = 0; i < arrNV.size(); i++) {
            System.out.println(arrNV.get(i));
        }
    }
}
