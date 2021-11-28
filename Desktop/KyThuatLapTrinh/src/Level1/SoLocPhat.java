package Level1;
import  java.util.*;
public class SoLocPhat {

    public static boolean flag = true;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            int n = in.nextInt();
            String str = "";
            List<String> list = new ArrayList<>();

            while (true) {
                str = genNum(str);
                if (str.length() > n) {
                    break;
                }
                list.add(str);
            }
            System.out.println(list.size());
            for (int i = list.size() - 1; i >= 0; i--) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
        }
    }

    public static String genNum(String str) {
        int i = str.length() - 1;
        StringBuilder sb = new StringBuilder(str);
        while (i >= 0 && sb.charAt(i) != '6') {
            sb.setCharAt(i--, '6');
        }
        if (i == -1) {
            sb.append("6");
        } else {
            sb.setCharAt(i, '8');
        }
        return sb.toString();
    }
}