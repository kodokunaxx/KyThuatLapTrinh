package OOP.ThiSinh;

public class ThiSinh {
    String hoten, ngaysinh;
    float d1, d2, d3, tong;

    public ThiSinh(String hoten, String ngaysinh, float d1, float d2, float d3) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.tong = this.d1 + this.d2 + this.d3;
    }

    @Override
    public String toString() {
        return hoten + " " + ngaysinh + " " + String.format("%.1f", tong);
    }
}
