package OOP.NhanVien;

public class NhanVien {
    private String ma,ten, gioiTinh, ngaySinh, diaChi, mst, ngayKy;

    public NhanVien(String ten, String gioiTinh, String ngaySinh, String diaChi, String mst, String ngayKy) {
        this.ma = "00001";
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.mst = mst;
        this.ngayKy = ngayKy;
    }

    @Override
    public String toString() {
        return ma + ' ' + ten + " " + gioiTinh + " " + ngaySinh + " "
                + diaChi + " " + mst + " " + ngayKy;
    }
}
