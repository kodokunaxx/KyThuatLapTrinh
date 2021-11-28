package Level1;
import java.util.*;

//  ĐÁNH DẤU CHỮ CÁI
public class DanhDauChuCai {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(in.next().chars().distinct().count());
    }
}
