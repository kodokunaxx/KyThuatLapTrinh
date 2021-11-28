package HuongDoiTuong.sapxepdanhsachnhanvien;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<NhanVien> arrNhanVien = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            NhanVien nhanVien = new NhanVien(i, scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
            arrNhanVien.add(nhanVien);
        }

        Collections.sort(arrNhanVien);
        for (NhanVien i : arrNhanVien) {
            System.out.println(i);
        }
    }
}
