package HuongDoiTuong.tinhgiochuanchotunggiangvien;



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

        String maGVCheck = scanner.next();

        for (int i = 0; i < arrGV.size(); i++) {
            if (arrGV.get(i).getMaGV().equalsIgnoreCase(maGVCheck) == true) {
                System.out.println("Giang vien: " +arrGV.get(i).getTenGV());
                float tong = 0;
                for (int j = 0; j < arrDiem.size(); j++) {
                    if (arrGV.get(i).getMaGV().equalsIgnoreCase(arrDiem.get(j).getMaGV()) == true) {
                        String tenMonHoc = "";
                        for (int k = 0; k < arrMonHoc.size(); k++) {
                            if (arrDiem.get(j).getMaMon().equalsIgnoreCase(arrMonHoc.get(k).getMaMon()) == true){
                                tenMonHoc = arrMonHoc.get(k).getTenMon();
                                break;
                            }
                        }
                        System.out.println(tenMonHoc +" "+arrDiem.get(j).getTongSoGio());
                        tong += Float.parseFloat(arrDiem.get(j).getTongSoGio());
                    }
                }
                System.out.println("Tong: "+String.format("%.2f",tong));
                break;
            }
        }
    }
}
