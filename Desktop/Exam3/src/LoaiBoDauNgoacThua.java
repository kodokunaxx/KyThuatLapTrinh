import java.util.Scanner;
import java.util.Stack;

public class LoaiBoDauNgoacThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            Stack<Integer> st = new Stack<>();
            String str = sc.nextLine().replaceAll(" ","");
            int arr[] = new int[str.length()];
            for(int i = 0; i< arr.length;i++){
                arr[i] = -1;
            }
            for(int i=0;i<str.length();i++){
                if(str.charAt(i) == '('){
                    if(i==0) {
                        st.push(i);
                        arr[i] = st.peek();
                    }else if(str.charAt(i-1) != '-'){
                        st.push(i);
                        arr[i] = st.peek();
                    }
                }
                else {
                    if(str.charAt(i) == ')' && !st.isEmpty()){
                        arr[st.pop()] = -1;
                    }
                }
            }
            for(int i=0; i<str.length(); i++){
                if(i != arr[i]){
                    System.out.print(str.charAt(i));
                }
            }
        }
    }
}
/*
nếu trước ngoặc ( là + thì xóa ngoặc
nếu trước ngoặc ( là trừ và trong ngoặc k có + -) thì xóa ngoặc
*/
