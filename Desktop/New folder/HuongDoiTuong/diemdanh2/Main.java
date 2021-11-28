package HuongDoiTuong.diemdanh2;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLuong = Integer.parseInt(scanner.nextLine());
        ArrayList<SinhVien> arrInf = new ArrayList<>();
        ArrayList<SinhVien> arrDiem = new ArrayList<>();

        for (int i = 0; i < soLuong; i++) {
            String maSV = scanner.nextLine();
            String name= scanner.nextLine();
            String lop = scanner.nextLine();
            arrInf.add(new SinhVien(maSV,name,lop));
        }

        for (int i = 0; i < soLuong; i++) {
            String maSV = scanner.next();
            char[] check = scanner.nextLine().trim().toLowerCase(Locale.ROOT).toCharArray();
            int diemCC = 10;
            String ghiChu = "";
            for (int j = 0; j < check.length; j++) {
                if (check[j] == 'v'){
                    diemCC -= 2;
                } else if (check[j] == 'm') {
                    diemCC -= 1;
                } else if (check[j] == 'x'){
                    continue;
                }
            }

            if (diemCC <= 0) {
                diemCC = 0;
                ghiChu = "KDDK";
            } else {
                ghiChu = "lmao";
            }

            arrDiem.add(new SinhVien(maSV,diemCC, ghiChu));
        }

        String lop = scanner.nextLine();

        for (int i = 0; i < arrInf.size(); i++) {
            if (arrInf.get(i).getLop().equalsIgnoreCase(lop)) {
                for (int j = 0; j < arrDiem.size(); j++) {
                    if (arrInf.get(i).getMaSv().trim().equalsIgnoreCase(arrDiem.get(j).getMaSv().trim()) == true) {
                        if (arrDiem.get(j).getGhiChu().equalsIgnoreCase("lmao") == true) {
                            System.out.println(arrInf.get(i).getMaSv() + " " +
                                    arrInf.get(i).getName() + " " +
                                    arrInf.get(i).getLop() + " " +
                                    arrDiem.get(j).getDiemCC());
                            break;
                        } else {
                            System.out.println(arrInf.get(i).getMaSv() + " " +
                                    arrInf.get(i).getName() + " " +
                                    arrInf.get(i).getLop() + " " +
                                    arrDiem.get(j).getDiemCC() + " " +
                                    arrDiem.get(j).getGhiChu());
                            break;
                        }
                    }
                }
            }
        }
    }
}
