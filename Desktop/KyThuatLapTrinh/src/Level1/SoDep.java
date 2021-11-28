package Level1;
import java.util.*;

//  SỐ ĐẸP
public class SoDep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soBoTest = Integer.valueOf(sc.nextLine());
        while (soBoTest-->0){
            String str = sc.nextLine();
            boolean check = true;
            for (int i = 0; i <= str.length()/2; i++) {
                char left = str.charAt(i), right = str.charAt(str.length()-1-i);
                if(left != right || (left-'0')%2!=0){
                    System.out.println("NO");
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.println("YES");
            }
        }
    }
}
