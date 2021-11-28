package OOP.DanhSachSV2;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int stt = 0;
        while (t-->0){
            stt++;
            SinhVien a = new SinhVien(stt, sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()));
            System.out.println(a);
        }

    }
}
