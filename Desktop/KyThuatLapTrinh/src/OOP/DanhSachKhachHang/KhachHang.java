package OOP.DanhSachKhachHang;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KhachHang implements Comparable<KhachHang> {
    public String ma, ten, gioitinh, diachi;
    public Date ngaysinh;

    public KhachHang(int stt, String ten, String gioitinh, String ns, String diachi) throws ParseException {
        this.ma = "KH0" + String.format("%02d",stt);
        this.ten = formatTen(ten);
        this.gioitinh = gioitinh;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
        this.diachi = diachi;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + gioitinh + " " + diachi + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh);
    }

    @Override
    public int compareTo(KhachHang o) {
        return this.ngaysinh.compareTo(o.ngaysinh);
    }

    String formatTen(String str){
        str = str.trim().toLowerCase();
        str = str.replaceAll("\\s+", " ");
        String[] temp = str.split(" ");
        str="";
        for(int i=0;i<temp.length;i++) {
            str+=String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if(i<temp.length-1)
                str+=" ";
        }
        return str;
    }
}
