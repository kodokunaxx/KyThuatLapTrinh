package HuongDoiTuong.danhsachkhachhang;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int soLuong = Integer.parseInt(scanner.nextLine());

        ArrayList<KhachHang> arrKH = new ArrayList<>();
        for (int i = 1; i <= soLuong ; i++) {
            int ma = i;
            String name = scanner.nextLine();
            String sex = scanner.nextLine();
            String ngaySinh = scanner.nextLine();
            String diaChi = scanner.nextLine();
            String [] arrWord = name.trim().replaceAll("\\s+", " ").toLowerCase(Locale.ROOT).split(" ");
            String niceName = "";
            for (int j = 0; j < arrWord.length; j++) {
                niceName += String.valueOf(arrWord[j].charAt(0)).toUpperCase(Locale.ROOT) + arrWord[j].substring(1).toLowerCase(Locale.ROOT) + " ";
            }

            arrKH.add(new KhachHang(ma, niceName, sex, diaChi, ngaySinh));
        }

        Collections.sort(arrKH);
        for (int i = 0; i < arrKH.size() ; i++) {
            System.out.println(arrKH.get(i));
        }
    }
}
