package HuongDoiTuong.khaibaolopnhanvien;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String sex = scanner.nextLine();
        String brithday = scanner.nextLine();
        String address = scanner.nextLine();
        String maSoThue = scanner.nextLine();
        String dateOfContract = scanner.nextLine();

        NhanVien nhanVien = new NhanVien(name, sex, brithday, address, maSoThue, dateOfContract);
        System.out.println(nhanVien.toString());
    }
}
