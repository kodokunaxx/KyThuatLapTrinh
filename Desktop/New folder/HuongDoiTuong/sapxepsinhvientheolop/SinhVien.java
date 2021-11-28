package HuongDoiTuong.sapxepsinhvientheolop;

public class SinhVien implements Comparable<SinhVien>{
    private String maSV, name, lop, email;

    public SinhVien(String maSV, String name, String lop, String email) {
        this.maSV = maSV;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    @Override
    public String toString() {
        return  maSV + " " + name + " " + lop + " " + email + " ";
    }


    @Override
    public int compareTo(SinhVien o) {
        int result = this.lop.compareTo(o.lop);
        if (result > 0) return 1;
        else if (result < 0) return -1;
        else {
            return this.maSV.compareTo(o.maSV);
        }
    }
}
