package HuongDoiTuong.tinhtien;

public class HoaDon implements Comparable<HoaDon>{
    private String ma,ten;
    private int soLuong;
    private long donGia;
    private long chietKhau;
    private long thanhToan;

    public HoaDon(String ma, String ten, int soLuong, long donGia, long chietKhau) {
        this.ma = ma;
        this.ten = ten;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    public HoaDon(String ma, String ten, int soLuong, long donGia, long chietKhau, long thanhToan) {
        this.ma = ma;
        this.ten = ten;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
        this.thanhToan = thanhToan;
    }

    @Override
    public String toString() {
        return  ma + " " +ten + " " + soLuong + " "+ donGia +" "+ chietKhau+ " " +thanhToan ;
    }

    @Override
    public int compareTo(HoaDon o) {
        if ( this.thanhToan > o.thanhToan )
            return 1;
        else if ( this.thanhToan < o.thanhToan )
            return -1;
        else {
            if (this.thanhToan >  o.thanhToan)
                return 1;
            else
                return -1;
        }
    }
}
