package OOP.DanhSachKhachHang;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> ds = new ArrayList<>();
        for(int i=1;i<=t;i++){
            KhachHang a = new KhachHang(i, sc.nextLine(), sc.nextLine(), sc.nextLine(),sc.nextLine());
            ds.add(a);
        }
        Collections.sort(ds);
        for(KhachHang kh : ds){
            System.out.println(kh);
        }
    }
}
