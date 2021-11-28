package HuongDoiTuong.bangdiemtuyensinh;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soTS = Integer.parseInt(scanner.nextLine());
        ArrayList<ThiSinh> arrTS = new ArrayList<>();

        for (int i = 0; i < soTS; i++) {
            String ma = scanner.nextLine().trim();
            String ten = scanner.nextLine().trim();
            float toan = scanner.nextFloat();
            float ly = scanner.nextFloat();
            float hoa = scanner.nextFloat();
            ThiSinh ts = new ThiSinh(ma, ten, toan, ly, hoa);
            scanner.nextLine();
            arrTS.add(ts);
        }

        for (int i = 0; i < arrTS.size(); i++) {
            String ten = arrTS.get(i).getTen();
            String maTS = arrTS.get(i).getMaTS();
            String khuVuc = arrTS.get(i).getMaTS().substring(0, 3);
            float toan = Float.parseFloat(arrTS.get(i).getToan());
            float ly = Float.parseFloat(arrTS.get(i).getLy());
            float hoa = Float.parseFloat(arrTS.get(i).getHoa());
            float tong = toan * 2 + ly + hoa;

            float uuTien = 0;
            String status = "";

            switch (khuVuc) {
                case "KV1":
                    uuTien += 0.5;
                    break;
                case "KV2":
                    uuTien += 1;
                    break;
                case "KV3":
                    uuTien += 2.5;
                    break;
                default:
                    continue;
            }

            if (tong + uuTien >= 24) {
                status = "TRUNG TUYEN";
            } else {
                status = "TRUOT";
            }


            if (tong - ((int) tong) == 0) {
                int newTong = (int) tong;
                if (uuTien - ((int) uuTien) == 0) {
                    int newUuTien = (int) uuTien;
                    System.out.println(maTS + " " + ten + " " + newUuTien + " " + newTong + " " + status);
                } else {
                    System.out.println(maTS + " " + ten + " " + uuTien + " " + newTong + " " + status);
                }
            } else {
                if (uuTien - ((int) uuTien) == 0) {
                    int newUuTien = (int) uuTien;
                    System.out.println(maTS + " " + ten + " " + newUuTien + " " + tong + " " + status);
                } else {
                    System.out.println(maTS + " " + ten + " " + uuTien + " " + tong + " " + status);
                }
            }

        }
    }
}
