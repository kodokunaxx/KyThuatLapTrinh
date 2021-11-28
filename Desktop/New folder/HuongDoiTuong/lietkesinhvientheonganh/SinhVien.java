package HuongDoiTuong.lietkesinhvientheonganh;

public class SinhVien {
    private String maSV, ten, lop, email;

    public SinhVien(String maSV, String ten, String lop, String email) {
        this.maSV = maSV;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getTen() {
        return ten;
    }

    public String getLop() {
        return lop;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return maSV + " " + ten + " " + lop + " " + email;
    }
}
