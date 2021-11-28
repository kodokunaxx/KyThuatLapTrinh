package Level1;

import java.util.Scanner;

public class XauNhiPhanKeTiep {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-->0){
            String str = in.nextLine();
            String[] s = str.split("");
            for(int i=s.length-1;i>=0;i--){
                if(Integer.parseInt(s[i]) == 0){
                    s[i] = "1";
                    break;
                }else {
                    s[i] = "0";
                }
            }
            for (String item : s) {
                System.out.print(item);
            }
            System.out.println();
        }

    }
}
