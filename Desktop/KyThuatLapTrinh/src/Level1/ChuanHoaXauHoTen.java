package Level1;

import java.util.Locale;
import java.util.Scanner;

public class ChuanHoaXauHoTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String str = sc.nextLine().trim().toLowerCase();
            str = str.replaceAll("\\s+", " ");
            String[] temp = str.split(" ");
            str="";
            for(int i=0;i<temp.length;i++) {
                str+=String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
                if(i<temp.length-1)
                    str+=" ";
            }
            System.out.println(str);
        }

    }
}
