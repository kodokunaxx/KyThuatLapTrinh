package Level1;

import java.util.*;

public class RutGonXauKyTu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(in.next());

        for (int i = 0; i < sb.length() - 1; i++) {
            if (sb.charAt(i) == sb.charAt(i + 1)) {
                sb.delete(i, i + 2);
                if (i == 0) {
                    i = -1;
                } else {
                    i -= 2;
                }
            }
        }
        System.out.println(sb.length() == 0 ? "Empty String" : sb);
    }
}
