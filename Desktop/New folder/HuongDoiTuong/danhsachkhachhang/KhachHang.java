package HuongDoiTuong.danhsachkhachhang;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KhachHang implements Comparable<KhachHang>{
    private String maKH, ten, gioiTinh;
    private Date ngaySinh;
    private String diaChi;

    public KhachHang(int maKH, String ten, String gioiTinh, String diaChi, String ngaySinh) throws ParseException {
        this.maKH = String.format("%03d", maKH);
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
    }

    public String getMaKH() {
        return maKH;
    }

    public String getTen() {
        return ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    @Override
    public String toString() {
        return "KH" +maKH+ " " +ten+ " " +gioiTinh+ " "  +diaChi + " "+ new SimpleDateFormat("dd/MM/yyyy").format(ngaySinh) ;
    }

    @Override
    public int compareTo(KhachHang o) {
        return this.ngaySinh.compareTo(o.ngaySinh);
    }
}
