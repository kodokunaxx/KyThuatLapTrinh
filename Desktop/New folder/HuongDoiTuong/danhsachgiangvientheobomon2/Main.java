package HuongDoiTuong.danhsachgiangvientheobomon2;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLuong = Integer.parseInt(scanner.nextLine());
        ArrayList<GiangVien> arrGV = new ArrayList<>();
        for (int i = 1; i <= soLuong; i++) {
            arrGV.add(new GiangVien(i, scanner.nextLine(), scanner.nextLine()));
        }

        int soMon = Integer.parseInt(scanner.nextLine());
        ArrayList<String> arrMon = new ArrayList<>();
        for (int i = 1; i <= soMon; i++) {
            arrMon.add(scanner.nextLine().trim());
        }

        for (int i = 0; i < arrMon.size(); i++) {
            String[] arrWord = arrMon.get(i).split(" ");
            String tenVietTat = "";

            for (int j = 0; j < arrWord.length; j++) {
                tenVietTat += String.valueOf(arrWord[j].charAt(0)).toUpperCase(Locale.ROOT);
            }

            System.out.println("DANH SACH GIANG VIEN BO MON " +tenVietTat.toUpperCase(Locale.ROOT)+ ": ");
            for (int j = 0; j < arrGV.size(); j++) {
                if (arrGV.get(j).getMon().equalsIgnoreCase(arrMon.get(i)) == true) {
                    System.out.println("GV"+arrGV.get(j).getMa() + " " + arrGV.get(j).getName()
                    +" "+tenVietTat);
                }
            }
        }
    }
}
