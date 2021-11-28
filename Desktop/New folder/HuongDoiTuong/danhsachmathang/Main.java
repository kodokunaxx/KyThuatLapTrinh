package HuongDoiTuong.danhsachmathang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLuong = Integer.parseInt(scanner.nextLine());

        ArrayList<MatHang> arrMH = new ArrayList<>();
        for (int i = 1; i <= soLuong ; i++) {
            int maMatHang = i;
            String name = scanner.nextLine();
            String donViTinh = scanner.nextLine();
            long giaNhap = scanner.nextInt();
            long giaBan = scanner.nextInt();
            long loiNhuan = giaBan - giaNhap;

            arrMH.add(new MatHang(maMatHang, name, donViTinh, giaNhap, giaBan,loiNhuan));
            scanner.nextLine();
        }

        Collections.sort(arrMH);
        for (int i = arrMH.size()-1; i >=0 ; i--) {
            System.out.println(arrMH.get(i));
        }
    }
}
