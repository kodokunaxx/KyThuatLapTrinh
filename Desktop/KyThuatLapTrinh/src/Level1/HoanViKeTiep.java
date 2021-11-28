package Level1;
import java.util.*;
public class HoanViKeTiep {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n + 1];
            for(int i = 1; i <= n; i++) {
                arr[i] = in.nextInt();
            }
            int index = n;
            while( index > 1 && arr[index] < arr[index - 1]) {
                index--;
            }

            if( index == 1) {
                for( int i = 1; i <= n; i++) {
                    System.out.print(i + " ");
                }
            }else {
                for( int i = 1; i < index - 1; i++) {
                    System.out.print(arr[i] + " ");
                }

                for(int i = n; i > index; i--) {
                    if(arr[i] > arr[index]) {
                        swap(arr[i], arr[index]);
                        break;
                    }
                }
                for(int i = n; i >= index - 1; i--) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println("");
        }

    }

    public static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }
}