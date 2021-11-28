package HuongDoiTuong.lopinset;

import java.util.*;
public class IntSet {
    private  TreeSet<Integer> set= new TreeSet<>();

    public IntSet() {
    }
    
    public IntSet(int a[]){
        for (int i=0; i<a.length;i++){
            set.add(a[i]);
        }
    }

    @Override
    public String toString() {
         String tmp ="";
        for( Integer i: set){
            tmp = tmp +String.valueOf(i)+ " ";
        }
        return tmp;
    }

    IntSet union(IntSet other){
        IntSet u =new IntSet();
        u.set.addAll(set);
        u.set.addAll(other.set);
        return u;
    }
    
}
