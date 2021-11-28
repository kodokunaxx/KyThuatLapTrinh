package HuongDoiTuong.tinhtien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLuongTest = scanner.nextInt();
        ArrayList<HoaDon> arrHoaDon = new ArrayList<>();
        for (int i = 0; i < soLuongTest; i++) {
            scanner.nextLine();
            String ma = scanner.nextLine();
            String name = scanner.nextLine();
            int soLuong= scanner.nextInt();
            long donGia= scanner.nextLong();
            long chietKhau = scanner.nextLong();
            long thanhToan = donGia*soLuong -chietKhau;
            HoaDon hoaDon = new HoaDon(ma, name, soLuong, donGia,chietKhau,thanhToan);
            arrHoaDon.add(hoaDon);
        }

        Collections.sort(arrHoaDon);

        for (int i = arrHoaDon.size()-1; i >= 0 ; i--) {
            System.out.println(arrHoaDon.get(i));
        }
    }
}
