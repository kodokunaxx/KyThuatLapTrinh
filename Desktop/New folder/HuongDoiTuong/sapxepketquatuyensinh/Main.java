package HuongDoiTuong.sapxepketquatuyensinh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soTS = Integer.parseInt(scanner.nextLine());
        ArrayList<ThiSinh> arrTS = new ArrayList<>();

        for (int i = 0; i < soTS; i++) {
            String ma = scanner.nextLine();
            String ten = scanner.nextLine();
            float toan = Float.parseFloat(scanner.nextLine());
            float ly = Float.parseFloat(scanner.nextLine());
            float hoa = Float.parseFloat(scanner.nextLine());
            ThiSinh ts = new ThiSinh(ma, ten, toan, ly, hoa);
            arrTS.add(ts);
            scanner.nextLine();
        }

        ArrayList<ThiSinh> arrResult = new ArrayList<>();
        for (int i = 0; i < arrTS.size(); i++) {
            String ten = arrTS.get(i).getTen();
            String maTS = arrTS.get(i).getMaTS();
            String khuVuc = arrTS.get(i).getMaTS().trim().substring(0, 3);
            float toan = Float.parseFloat(arrTS.get(i).getToan());
            float ly = Float.parseFloat(arrTS.get(i).getLy());
            float hoa = Float.parseFloat(arrTS.get(i).getHoa());
            float tong = toan * 2 + ly + hoa;

            float uuTien = 0;
            String status = "";
            float result = 0;

            if (khuVuc.equalsIgnoreCase("KV1")){
                uuTien += 0.5f;
            } else if (khuVuc.equalsIgnoreCase("KV2")) {
                uuTien += 1f;
            } else if (khuVuc.equalsIgnoreCase("KV3")) {
                uuTien += 2.5f;
            }

            result = uuTien + tong;

            if (result >= 24) {
                status = "TRUNG TUYEN";
            } else {
                status = "TRUOT";
            }

            arrResult.add(new ThiSinh(maTS, ten, uuTien,  result, status));
        }

        Collections.sort(arrResult);

        for (int i = arrResult.size() - 1; i >= 0; i--) {
            String maTS = arrResult.get(i).getMaTS();
            String ten = arrResult.get(i).getTen();
            float uuTien = Float.parseFloat(arrResult.get(i).getDiemUuTien());
            float result = Float.parseFloat(arrResult.get(i).getTongDiem());
            String status = arrResult.get(i).getStatus();

            if (result - ((int) result) == 0) {
                int newTong = (int) result;
                if (uuTien - ((int) uuTien) == 0) {
                    int newUuTien = (int) uuTien;
                    System.out.println(maTS + " " + ten + " " + newUuTien + " " + newTong + " " + status);
                } else {
                    System.out.println(maTS + " " + ten + " " + uuTien + " " + newTong + " " + status);
                }
            } else {
                if (uuTien - ((int) uuTien) == 0) {
                    int newUuTien = (int) uuTien;
                    System.out.println(maTS + " " + ten + " " + newUuTien + " " + result + " " + status);
                } else {
                    System.out.println(maTS + " " + ten + " " + uuTien + " " + result + " " + status);
                }
            }
        }
    }
}
