package HuongDoiTuong.danhsachgiangvientheobomon;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soGV = Integer.parseInt(scanner.nextLine());
        ArrayList<GiangVien> arrGV = new ArrayList<>();

        for (int i = 1; i <= soGV; i++) {
            String name = scanner.nextLine();
            String mon = scanner.nextLine();
            arrGV.add(new GiangVien(name, mon));
        }

        int soMon = Integer.parseInt(scanner.nextLine());
        ArrayList<String> arrMon = new ArrayList<>();
        for (int i = 0; i < soMon; i++) {
            arrMon.add(scanner.nextLine());
        }
        for (int i = 0; i < soMon; i++) {
            String[] arrWord = arrMon.get(i).split(" ");
            String name = "";
            for (int j = 0; j < arrWord.length; j++) {
                name+= String.valueOf(arrWord[j].charAt(0)).toUpperCase(Locale.ROOT);
            }

            System.out.println("DANH SACH GIANG VIEN BO MON " +name+": ");
            for (int j = 0; j < arrGV.size(); j++) {
                if (arrMon.get(i).equalsIgnoreCase(arrGV.get(j).getMon()) == true){
                    System.out.println("GV"+String.format("%02d", j+1)+" "+
                            arrGV.get(j).getName() +" "+
                            name);
                }
            }
        }
    }
}
