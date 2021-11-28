package HuongDoiTuong.danhsachdoituongsinhvien2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien {
    private String ma, ten, lop;
    private Date birthday;
    private float gpa;

    public SinhVien(int ma, String ten, String lop, String birthday, String gpa) throws ParseException {
        this.ma = String.format("%03d", ma);
        this.ten = ten;
        this.lop = lop;
        this.birthday = new SimpleDateFormat("dd/MM/yyyy").parse(birthday);
        this.gpa = Float.parseFloat(gpa);
    }

    @Override
    public String toString() {
        return "B20DCCN" + ma + " " + ten + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(birthday) + " "+ String.format("%.2f", gpa);
    }
}
