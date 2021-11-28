package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class DaoTu
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            xuly(s);
        }
    }

    public static void xuly(String s){
        Stack<Character> st = new Stack<>();
        Scanner sc = new Scanner(s);
        while (sc.hasNext()){
            String tmp = sc.next();
            for(int i=0; i<tmp.length();i++){
                if(tmp.charAt(i) != ' ') st.push(tmp.charAt(i));
                else {
                    while(st.empty()){
                        System.out.print(st.peek());
                        st.pop();
                    }
                }
            }
            while (!st.empty()){
                System.out.print(st.peek());
                st.pop();
            }
            System.out.print(" ");
        }
        System.out.println();
    }
}
