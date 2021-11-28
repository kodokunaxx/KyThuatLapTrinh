package OOP.DanhSachMatHang;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int dem=0;
        List<DanhSachMatHang> list=new ArrayList<DanhSachMatHang>();
        int t=Integer.parseInt(in.nextLine());
        while(t-->0){
            dem++;
            DanhSachMatHang ds=new DanhSachMatHang(dem, in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine()));
            list.add(ds);
        }
        Collections.sort(list, new Comparator<DanhSachMatHang>() {
            @Override
            public int compare(DanhSachMatHang o1, DanhSachMatHang o2) {
                if((o2.getLoinhuan()-o1.getLoinhuan())>0){
                    return 1;
                }
                if((o2.getLoinhuan()-o1.getLoinhuan())==0){
                    String s1=o1.getMa();
                    String s2=o2.getMa();
                    return s1.compareTo(s2);
                }
                return -1;
            }
        });
        for(DanhSachMatHang i:list){
            System.out.println(i);
        }
        }
}
