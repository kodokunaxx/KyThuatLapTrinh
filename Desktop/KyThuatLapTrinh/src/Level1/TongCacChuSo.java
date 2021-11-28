package Level1;
import java.util.*;

//  TÍNH TỔNG CÁC CHỮ SỐ
public class TongCacChuSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soBoTest = Integer.valueOf(sc.nextLine());
        while (soBoTest-->0) {
            String str = sc.nextLine();
            List<Character> list = new ArrayList<Character>();
            int sum = 0;
            for(int i = 0; i < str.length(); i++){
                char temp = str.charAt(i);
                if(temp>='0' && temp<='9'){
                    sum+= temp - '0';
                }else list.add(str.charAt(i));
            }
            Collections.sort(list);
            list.forEach(System.out::print);
            if(sum>0)System.out.println(sum);
            else System.out.println();
        }

    }
}
