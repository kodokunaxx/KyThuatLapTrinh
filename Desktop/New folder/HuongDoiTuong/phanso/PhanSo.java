package HuongDoiTuong.phanso;

public class PhanSo {
    private long x, y;

    public PhanSo(long x, long y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return  x + "/" + y;
    }
    public void rutGon() {
        long k = ucln(x, y);
        x /= k;
        y /= k;
    }

    private long ucln(long a, long b) {
        long temp;
        while (b > 0) {
            temp = a % b;
            a = b; b =temp;
        }
        return a;
    }
}
