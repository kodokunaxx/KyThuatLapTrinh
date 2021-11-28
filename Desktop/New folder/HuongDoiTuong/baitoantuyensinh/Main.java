package HuongDoiTuong.baitoantuyensinh;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ma = scanner.nextLine().trim();
        String ten = scanner.nextLine().trim();
        float toan = scanner.nextFloat();
        float ly = scanner.nextFloat();
        float hoa = scanner.nextFloat();
        String khuVuc = ma.substring(0, 3);
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
                break;
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
                System.out.println(ma + " " + ten + " " + newUuTien + " " + newTong + " " + status);
            } else {
                System.out.println(ma + " " + ten + " " + uuTien + " " + newTong + " " + status);
            }
        } else {
            if (uuTien - ((int) uuTien) == 0) {
                int newUuTien = (int) uuTien;
                System.out.println(ma + " " + ten + " " + newUuTien + " " + tong + " " + status);
            } else {
                System.out.println(ma + " " + ten + " " + uuTien + " " + tong + " " + status);
            }
        }

    }
}

