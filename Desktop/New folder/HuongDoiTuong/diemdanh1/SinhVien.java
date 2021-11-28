package HuongDoiTuong.diemdanh1;

public class SinhVien {
    private String maSv, name, lop;
    private int diemCC;
    private String ghiChu;

    public SinhVien(String maSv, String name, String lop) {
        this.maSv = maSv;
        this.name = name;
        this.lop = lop;
    }

    public SinhVien(String maSv, int diemcc, String ghiChu) {
        this.maSv = maSv;
        this.diemCC = diemcc;
        this.ghiChu = ghiChu;
    }




    public String getMaSv() {
        return maSv;
    }

    public String getName() {
        return name;
    }

    public String getLop() {
        return lop;
    }

    public int getDiemCC() {
        return diemCC;
    }

    public String getGhiChu() {
        return ghiChu;
    }


}
