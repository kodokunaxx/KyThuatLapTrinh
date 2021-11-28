package LapTrinhCoBan;

import java.util.Scanner;
import java.util.Stack;

public class RutGonXauKiTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuffer rs = new StringBuffer();
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(stack.isEmpty()) stack.push(s.charAt(i));
            else{
                if(stack.peek() == s.charAt(i)){
                    stack.pop();
                }
                else{
                    stack.push(s.charAt(i));
                }
            }
        }
        if(stack.isEmpty()){
            System.out.println("Empty String");
        }
        else while(!stack.isEmpty()){
            rs.append(stack.peek());
            stack.pop();
        }
        System.out.println(rs.reverse());
    }
}
