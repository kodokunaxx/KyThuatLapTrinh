package HuongDoiTuong.lietkesinhvientheolop;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soSV = Integer.parseInt(scanner.nextLine());
        ArrayList<SinhVien> arrSV = new ArrayList<>();
        for (int i = 0; i < soSV; i++) {
            String maSV = scanner.nextLine();
            String name = scanner.nextLine();
            String lop = scanner.nextLine();
            String email = scanner.nextLine();

            SinhVien sv = new SinhVien(maSV, name, lop,email);
            arrSV.add(sv);
        }

        int q = Integer.parseInt(scanner.nextLine());
        ArrayList<String> arrLop = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            arrLop.add(scanner.nextLine());
        }

        for (int i = 0; i < arrLop.size(); i++) {
            System.out.println("DANH SACH SINH VIEN LOP " +arrLop.get(i)+ ": ");
            for (int j = 0; j < arrSV.size(); j++) {
                if (arrLop.get(i).equals(arrSV.get(j).getLop())) {
                    System.out.println(arrSV.get(j));
                }
            }
        }
    }
}
