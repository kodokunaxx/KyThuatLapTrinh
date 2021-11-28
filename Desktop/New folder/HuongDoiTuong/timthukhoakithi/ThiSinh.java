package HuongDoiTuong.timthukhoakithi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThiSinh implements Comparable<ThiSinh>{
    private int ma;
    private String name;
    private String ngaySinh;
    private float x1, x2, x3, tong;

    public ThiSinh(int ma, String name, String ngaySinh, float tong) throws ParseException {
        this.ma = ma;
        this.name = name;
        this.ngaySinh = ngaySinh;
        this.tong = tong;
    }

    public float getTong() {
        return tong;
    }

    @Override
    public String toString() {
        return  ma + " " + name + " " +ngaySinh + " " + tong ;
    }

    @Override
    public int compareTo(ThiSinh o) {
        if (this.tong > o.tong) return 1;
        else if (this.tong < o.tong) return -1;
        else {
            if (this.ma > o.ma) return 1;
            else return -1;
        }
    }
}
