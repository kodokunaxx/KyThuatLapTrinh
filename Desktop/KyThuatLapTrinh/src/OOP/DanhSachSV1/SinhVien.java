package OOP.DanhSachSV1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien {
    private String ma, ten, lop;
    private Date ngaysinh;
    private float gpa;

    public SinhVien(int stt,String ten, String lop, String ngaysinh, float gpa) throws ParseException {
        this.ma = stt > 9 ? "B20DCCN0" + stt : "B20DCCN00" + stt;
        this.ten = ten;
        this.lop = lop;
        this.ngaysinh = new SimpleDateFormat("dd/mm/yyyy").parse(ngaysinh);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + new SimpleDateFormat("dd/mm/yyyy").format(ngaysinh)
                + " " + String.format("%.2f", gpa);
    }
}
