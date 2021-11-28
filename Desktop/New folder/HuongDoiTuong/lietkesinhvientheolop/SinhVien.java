package HuongDoiTuong.lietkesinhvientheolop;

public class SinhVien {
    private String maSV, name, lop, email;

    public SinhVien(String maSV, String name, String lop, String email) {
        this.maSV = maSV;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getName() {
        return name;
    }

    public String getLop() {
        return lop;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return maSV + " " + name + " " + lop + " "  + email;
    }
}
