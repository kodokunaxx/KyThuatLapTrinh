package Level1;
import java.util.*;

//  MẢNG ĐỐI XỨNG
public class MangDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soBoTest = sc.nextInt();
        while (soBoTest-->0){
            int soPhanTu = sc.nextInt();
            int[] arr = new int[soPhanTu];
            for (int i = 0; i < soPhanTu; i++) {
                arr[i] = sc.nextInt();
            }
            if(isDoiXung(arr)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }

        }
    }

    public static boolean isDoiXung(int[] arr){
        for(int i = 0; i < arr.length/2; i++){
            if(arr[i]!=arr[arr.length-1-i]){
                return false;
            }
        }
        return true;
    }
}
