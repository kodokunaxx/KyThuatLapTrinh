package HuongDoiTuong.lophocphan2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLopHocPhan = Integer.parseInt(scanner.nextLine());
        ArrayList<HocPhan> arrHP = new ArrayList<>();
        for (int i = 0; i < soLopHocPhan; i++) {
            String maHP = scanner.nextLine();
            String tenHP = scanner.nextLine();
            int nhom = Integer.parseInt(scanner.nextLine());
            String giangVien = scanner.nextLine();

            HocPhan hp = new HocPhan(maHP, tenHP, nhom, giangVien);
            arrHP.add(hp);
        }

        int soGiangVien = Integer.parseInt(scanner.nextLine());
        ArrayList<String> arrGiangVien = new ArrayList<>();
        for (int i = 0; i < soGiangVien; i++) {
            arrGiangVien.add(scanner.nextLine());
        }


        Collections.sort(arrHP);

        for (int i = 0; i < arrGiangVien.size(); i++) {
            System.out.println("Danh sach cho giang vien " +arrGiangVien.get(i) +": ");
            for (int j = 0; j < arrHP.size(); j++) {
                if (arrGiangVien.get(i).equals(arrHP.get(j).getGiangVien()) == true){
                    System.out.println(arrHP.get(j));
                }
            }
        }
    }
}
