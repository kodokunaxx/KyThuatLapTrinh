package OOP.DanhSachDoiTuongNV;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NhanVien {
    private String ma, ten, gioitinh, diachi, mst;
    private Date ngaysinh, ngaykyHD;

    public NhanVien(int stt, String ten, String gioitinh, String ngaysinh, String diachi, String mst, String ngaykyHD) throws ParseException {
        this.ma = String.format("%05d", stt);
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.ngaysinh = new SimpleDateFormat("dd/mm/yyyy").parse(ngaysinh);
        this.diachi = diachi;
        this.mst = mst;
        this.ngaykyHD = new SimpleDateFormat("dd/mm/yyyy").parse(ngaykyHD);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + gioitinh + " " + new SimpleDateFormat("dd/mm/yyyy").format(ngaysinh) + " " + diachi + " " + mst + " " + new SimpleDateFormat("dd/mm/yyyy").format(ngaykyHD);
    }
}
