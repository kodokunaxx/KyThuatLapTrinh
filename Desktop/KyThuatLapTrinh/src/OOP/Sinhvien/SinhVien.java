package OOP.Sinhvien;

import java.text.*;
import java.util.*;

public class SinhVien {
    private String ma, ten, lop;
    private Date ngaysinh;
    private float gpa;

    public SinhVien(String ten, String lop, String ns, float gpa) throws ParseException {
        this.ma = "B20DCCN001";
        this.ten = ten;
        this.lop = lop;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh)
                + " " + String.format("%.2f", gpa);
    }
}
