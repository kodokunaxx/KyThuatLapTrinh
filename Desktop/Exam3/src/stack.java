import java.util.Scanner;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) {
            String s = sc.nextLine();
            Stack<Integer> st = new Stack<>();
            int in = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    in++;
                    st.push(in);
                    int tmp = st.peek();
                    System.out.print(tmp + ' ');
                } else {
                    if (st.isEmpty()) continue;
                    if (s.charAt(i) == ')') {
//                        System.out.println(stack);
//                        System.out.print(stack.pop() + ' ');
                    }
                }
            }
        }
    }
}
