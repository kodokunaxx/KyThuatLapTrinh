package NganXep;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SoPhatLoc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-->0){
            int n = in.nextInt();
            xuly(n);
        }
    }
    
    public static void xuly(int n){
        Queue<String> q = new LinkedList<String>();
        ArrayList<Long>arr = new ArrayList<Long>();
        q.add("6");
        q.add("8");
        while(true){
            String tmp = q.poll();
            if(tmp.length()>n){
                break;
            }
            arr.add(Long.parseLong(tmp));
            q.add(tmp + "6");
            q.add(tmp + "8");
        }
        arr.sort((a,b) -> a.compareTo(b)*(-1));
        System.out.println(arr.size());
        for(Long kq:arr){
            System.out.print(kq+ " ");
        }
        System.out.println();
    }
}