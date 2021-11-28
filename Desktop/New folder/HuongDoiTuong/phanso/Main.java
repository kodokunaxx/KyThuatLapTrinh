package HuongDoiTuong.phanso;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhanSo p = new PhanSo(scanner.nextLong(), scanner.nextLong());
        p.rutGon();
        System.out.println(p);
    }
}
