package HuongDoiTuong.khaibaolopsinhvien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien {
    private String name;
    private String lop;
    private Date ngaySinh;
    private String gpa;
    private String maSV = "B20DCCN001";

    public SinhVien(String name, String lop, String ngaySinh, float gpa) throws ParseException {
        this.name = name;
        this.lop = lop;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.gpa =  String.format("%.2f",gpa);
    }



    @Override
    public String toString() {
        return maSV +" "+name + " " + " " + lop + " "+
                new SimpleDateFormat("dd/MM/yyyy").format(ngaySinh) + " " +
                gpa ;
    }
}
