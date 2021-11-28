package HuongDoiTuong.tinhthunhapgiaovien;

public class GiaoVien {
    private String ma, ten;
    private long luongCoBan;
    private int heSoBacLuong;
    private int phuCap;
    private long thuNhap;

    public GiaoVien(String ma, String ten, long luongCoBan) {
        this.ma = ma;
        this.ten = ten;
        this.luongCoBan = luongCoBan;
    }

    public GiaoVien(String ma, String ten, int heSoBacLuong, int phuCap, long thuNhap) {
        this.ma = ma;
        this.ten = ten;
        this.heSoBacLuong = heSoBacLuong;
        this.phuCap = phuCap;
        this.thuNhap = thuNhap;
    }

    @Override
    public String toString() {
        return  ma + " " +  ten + " "+ heSoBacLuong + " " + phuCap +  " " + thuNhap;
    }
}
