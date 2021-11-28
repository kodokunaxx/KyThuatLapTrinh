package Level1;

import java.util.*;

public class DiaChiEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<String> lst = new ArrayList<>();
        while(t-->0){
            String str = sc.nextLine().trim().toLowerCase();
            str = str.replaceAll("\\s+", " ");
            String[] temp = str.split(" ");
            str=temp[temp.length-1];
            for(int i=0;i<temp.length-1;i++) {
                str+=String.valueOf(temp[i].charAt(0));
            }
            lst.add(str);
        }
        HashMap<String, Integer> map = new HashMap<String,Integer>();
        for (int i=0;i<lst.size();i++){
            if(map.containsKey(lst.get(i))){
                map.put(lst.get(i), map.get(lst.get(i)) +1);
                System.out.println(lst.get(i) + map.get(lst.get(i)) + "@ptit.edu.vn");
            }else {
                map.put(lst.get(i), 1);
                System.out.println(lst.get(i) + "@ptit.edu.vn");
            }
        }
    }
}
