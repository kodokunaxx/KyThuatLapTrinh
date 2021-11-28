package HuongDoiTuong.bangtinhgiochuan;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soMonHoc = Integer.parseInt(scanner.nextLine());
        ArrayList<MonHoc> arrMonHoc = new ArrayList<>();

        for (int i = 0; i < soMonHoc; i++) {
            arrMonHoc.add(new MonHoc(scanner.next(), scanner.nextLine()));
        }

        int soGV = Integer.parseInt(scanner.nextLine());
        ArrayList<GiaoVien> arrGV = new ArrayList<>();

        for (int i = 0; i < soGV; i++) {
            arrGV.add(new GiaoVien(scanner.next(), scanner.nextLine()));
        }

        int soMonTinhDiem = Integer.parseInt(scanner.nextLine());
        ArrayList<MonHoc> arrDiem = new ArrayList<>();

        for (int i = 0; i < soMonTinhDiem; i++) {
           arrDiem.add(new MonHoc(scanner.next(), scanner.next(), scanner.nextFloat()));
           scanner.nextLine();
        }

        for (int i = 0; i < arrGV.size(); i++) {
            float tong = 0;
            for (int j = 0; j < arrDiem.size(); j++) {
                if (arrGV.get(i).getMaGV().equalsIgnoreCase(arrDiem.get(j).getMaGV()) == true) {
                    tong += Float.parseFloat(arrDiem.get(j).getTongSoGio());
                }
            }
            System.out.println(arrGV.get(i).getTenGV() +" "+String.format("%.2f", tong));
        }
    }
}
