package HuongDoiTuong.sinhvien;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class SinhVien {
    private String ma, ten, lop;
    private Date ngaySinh;
    private float gpa;

    public SinhVien(String ten, String lop, String ngaySinh, float gpa) throws ParseException {
        this.ma = "B20DCCN001";
        this.ten = ten;
        this.lop = lop;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return  ma + " " + ten + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaySinh)
                + " " + String.format("%.2f", gpa);

    }
}
