package HuongDoiTuong.lietkesinhvientheonganh;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soSV = Integer.parseInt(scanner.nextLine());
        ArrayList<SinhVien> arrSV = new ArrayList<>();

        for (int i = 0; i < soSV; i++) {
            String maSV = scanner.nextLine().trim().toUpperCase(Locale.ROOT).replaceAll("\\s+", "");
            String ten = scanner.nextLine();
            String lop = scanner.nextLine();
            String email = scanner.nextLine();

            arrSV.add(new SinhVien(maSV, ten, lop, email));
        }

        int soTest = Integer.parseInt(scanner.nextLine());
        ArrayList<String> arrMaLop = new ArrayList<>();
        for (int i = 0; i < soTest; i++) {
            String maLop = scanner.nextLine().trim().toUpperCase(Locale.ROOT).trim().replaceAll("\\s+", " ");
            maLop = String.valueOf(maLop.charAt(0)).toUpperCase(Locale.ROOT) + maLop.substring(1).toLowerCase(Locale.ROOT);
            arrMaLop.add(maLop);
        }


        for (int i = 0; i < arrMaLop.size(); i++) {
            String tenNganh = arrMaLop.get(i);
            System.out.println("DANH SACH SINH VIEN NGANH " + tenNganh.toUpperCase(Locale.ROOT) +": ");
            for (int j = 0; j < arrSV.size(); j++) {
                switch (tenNganh) {
                    case "Ke toan":
                        if (arrSV.get(j).getMaSV().contains("DCKT") == true) System.out.println(arrSV.get(j));
                        break;
                    case "Cong nghe thong tin":
                        if (arrSV.get(j).getMaSV().contains("DCCN")== true && arrSV.get(j).getLop().charAt(0) != 'E') {
                            System.out.println(arrSV.get(j));
                        }
                        break;
                    case "An toan thong tin":
                        if (arrSV.get(j).getMaSV().contains("DCAT")== true && arrSV.get(j).getLop().charAt(0) != 'E') {
                            System.out.println(arrSV.get(j));
                        }
                        break;
                    case "Vien thong":
                        if (arrSV.get(j).getMaSV().contains("DCVT")== true) System.out.println(arrSV.get(j));
                        break;
                    case "Dien tu":
                        if (arrSV.get(j).getMaSV().contains("DCDT")== true) System.out.println(arrSV.get(j));
                        break;
                    default:
                        continue;

                }
            }
        }
    }
}
