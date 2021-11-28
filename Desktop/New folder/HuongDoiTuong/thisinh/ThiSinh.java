package HuongDoiTuong.thisinh;

public class ThiSinh {
    private String name, ngaySinh;
    private float a, b, c, sum;


    public ThiSinh(String name, String ngaySinh, float a, float b, float c) {
        this.name = name;
        this.ngaySinh = ngaySinh;
        this.a = a;
        this.b = b;
        this.c = c;
        this.sum = sum;
    }

    @Override
    public String toString() {
        return  name + " " + ngaySinh + String.format("%.1f",sum);
    }
}
