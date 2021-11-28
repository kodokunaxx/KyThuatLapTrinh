package HuongDoiTuong.tinhluong;

public class NhanVien {
    private String ma, ten, maPB, tenPB;
    private long luongCoBan;
    private int soNgayCong;
    private long luongThang;

    public NhanVien(String ma, String ten, long luongCoBan, int soNgayCong) {
        this.ma = ma;
        this.ten = ten;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
    }

    public NhanVien(String maPB, String tenPB) {
        this.maPB = maPB;
        this.tenPB = tenPB;
    }

    public NhanVien(String ma, String ten, String tenPB, long luongThang) {
        this.ma = ma;
        this.ten = ten;
        this.tenPB = tenPB;
        this.luongThang = luongThang;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getMaPB() {
        return maPB;
    }

    public String getTenPB() {
        return tenPB;
    }

    public long getLuongCoBan() {
        return luongCoBan;
    }

    public int getSoNgayCong() {
        return soNgayCong;
    }


    @Override
    public String toString() {
        return  ma  + " " + ten + " " + tenPB + " " + luongThang*1000;
    }
}
