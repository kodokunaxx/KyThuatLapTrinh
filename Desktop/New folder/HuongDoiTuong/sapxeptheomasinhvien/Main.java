package HuongDoiTuong.sapxeptheomasinhvien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SinhVien> arrSV = new ArrayList<>();
        while (scanner.hasNext()) {
            String maSV = scanner.nextLine();
            String name = scanner.nextLine();
            String lop = scanner.nextLine();
            String email = scanner.nextLine();
            
            SinhVien sv = new SinhVien(maSV, name,lop,email);
            arrSV.add(sv);
        }
        Collections.sort(arrSV);

        for (int i = 0; i < arrSV.size(); i++) {
            System.out.println(arrSV.get(i));
        }
    }
}
