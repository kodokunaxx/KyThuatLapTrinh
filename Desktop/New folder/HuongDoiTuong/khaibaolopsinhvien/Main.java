package HuongDoiTuong.khaibaolopsinhvien;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String lop = scanner.nextLine();
        String ngaySinh = scanner.nextLine();
        float gpa = scanner.nextFloat();
        SinhVien sinhVien = new SinhVien(name, lop, ngaySinh, gpa);
        System.out.println(sinhVien);
    }
}
