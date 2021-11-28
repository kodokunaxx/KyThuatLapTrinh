package HuongDoiTuong.danhsachnhanvien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NhanVien {
    private String ma, name, sex,address, maSoThue;
    private Date birthday, dateOfContract;

    public NhanVien(int id, String name, String sex, String birthday, String address, String maSoThue, String dateOfContract) throws ParseException {
        this.ma = String.format("%05d", id);
        this.name = name;
        this.sex = sex;
        this.birthday = new SimpleDateFormat("dd/MM/yyyy").parse(birthday);
        this.address = address;
        this.maSoThue = maSoThue;
        this.dateOfContract = new SimpleDateFormat("dd/MM/yyyy").parse(dateOfContract);
    }

    @Override
    public String toString() {
        return  ma + " " +
                name + " " +
                sex + " " +
                new SimpleDateFormat("dd/MM/yyyy").format(birthday) + " " +
                address + " "  +
                maSoThue + " " +
                new SimpleDateFormat("dd/MM/yyyy").format(dateOfContract);
    }
}
