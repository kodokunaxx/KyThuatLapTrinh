package HuongDoiTuong.khaibaolopnhanvien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NhanVien {
    private String id = "00001";
    private String name, sex,address, maSoThue;
    private Date birthday, dateOfContract;

    public NhanVien(String name, String sex, String birthday, String address, String maSoThue, String dateOfContract) throws ParseException {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthday = new SimpleDateFormat("dd/MM/yyyy").parse(birthday);
        this.address = address;
        this.maSoThue = maSoThue;
        this.dateOfContract = new SimpleDateFormat("dd/MM/yyyy").parse(dateOfContract);
    }

    @Override
    public String toString() {
        return  id + " " +
                name + " " +
                sex + " " +
                new SimpleDateFormat("dd/MM/yyyy").format(birthday) + " " +
                address + " "  +
                maSoThue + " " +
                new SimpleDateFormat("dd/MM/yyyy").format(dateOfContract);
    }
}
