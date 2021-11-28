package OOP.DanhSachDoiTuongNV;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> lst = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            NhanVien a = new NhanVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            lst.add(a);
        }

        for(NhanVien item : lst){
            System.out.println(item);
        }
    }
}
