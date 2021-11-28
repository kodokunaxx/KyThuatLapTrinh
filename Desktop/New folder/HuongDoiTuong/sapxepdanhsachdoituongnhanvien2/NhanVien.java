package HuongDoiTuong.sapxepdanhsachdoituongnhanvien2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NhanVien implements Comparable<NhanVien>{
    private String maNV;
    private String name;
    private String gioiTinh;
    private Date ngaySinh;
    private String address;
    private String maSoThue;
    private Date ngayKiHopDong;

    public NhanVien(int maNV, String name, String gioiTinh, String ngaySinh, String address, String maSoThue, String ngayKiHopDong) throws ParseException {
        this.maNV = String.format("%05d", maNV);
        this.name = name;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.address = address;
        this.maSoThue = maSoThue;
        this.ngayKiHopDong = new SimpleDateFormat("dd/MM/yyyy").parse(ngayKiHopDong);
    }

    @Override
    public String toString() {
        return  maNV + " " + name + " " +  gioiTinh + " " +
                new SimpleDateFormat("dd/MM/yyyy").format(ngaySinh) +" "+ address + " " + maSoThue + " " +
                " "+  new SimpleDateFormat("dd/MM/yyyy").format(ngayKiHopDong);
    }

    @Override
    public int compareTo(NhanVien o) {
        return this.ngaySinh.compareTo(o.ngaySinh);
    }
}
