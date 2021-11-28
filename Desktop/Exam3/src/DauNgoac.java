import java.util.Scanner;
import java.util.Stack;

public class DauNgoac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            Stack<Integer> stack = new Stack<>();
            int in = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '('){
                    in++;
                    stack.push(in);
                    int tmp = stack.peek();
                    System.out.print(tmp + " ");
                }
                else {
                    if(stack.isEmpty()) continue;
                    if(s.charAt(i) == ')'){
                        System.out.print(stack.pop() + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}
