package  HuongDoiTuong.loppair;

public class Pair<I extends Number, I1 extends Number> {
    private int first, second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
    public boolean isPrime(){
        return check(first)&& check(second);
    }
    private boolean check (int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return first + " "+ second;
    }
}
