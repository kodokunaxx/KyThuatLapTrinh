package HuongDoiTuong.sapxepdonhang;

public class DonHang implements Comparable<DonHang>{
    private String name, ma;
    private long donGia;
    private int soLuong;
    private String soTT;
    private long giamGia, thanhTien;

    public DonHang(String name, String ma, long donGia, int soLuong) {
        this.name = name;
        this.ma = ma;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public DonHang(String name, String ma, String soTT, long giamGia, long thanhTien) {
        this.name = name;
        this.ma = ma;
        this.soTT = soTT;
        this.giamGia = giamGia;
        this.thanhTien = thanhTien;
    }

    public String getName() {
        return name;
    }

    public String getMa() {
        return ma;
    }

    public long getDonGia() {
        return donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public String getSoTT() {
        return soTT;
    }

    public long getGiamGia() {
        return giamGia;
    }

    public long getThanhTien() {
        return thanhTien;
    }

    @Override
    public String toString() {
        return  name + " " + " " + ma + " " + soTT + " " + giamGia + " " + thanhTien;
    }

    @Override
    public int compareTo(DonHang o) {
        return this.soTT.compareTo(o.soTT);
    }
}
