package HuongDoiTuong.danhsachmathang;

public class MatHang implements Comparable<MatHang> {
    private String maMatHang, tenMatHang, donViTinh;
    private long giaMua, giaBan;
    private long loiNhuan;

    public MatHang(int maMatHang, String tenMatHang, String donViTinh, long giaMua, long giaBan) {
        this.maMatHang = String.format("%03d",maMatHang);
        this.tenMatHang = tenMatHang;
        this.donViTinh = donViTinh;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public MatHang(int maMatHang, String tenMatHang, String donViTinh, long giaMua, long giaBan, long loiNhuan) {
        this.maMatHang = String.format("%03d", maMatHang);
        this.tenMatHang = tenMatHang;
        this.donViTinh = donViTinh;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan = loiNhuan;
    }

    public String getMaMatHang() {
        return maMatHang;
    }

    public String getTenMatHang() {
        return tenMatHang;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public long getGiaMua() {
        return giaMua;
    }

    public long getGiaBan() {
        return giaBan;
    }

    public long getLoiNhuan() {
        return loiNhuan;
    }

    @Override
    public String toString() {
        return "MH" +maMatHang+ " " +tenMatHang+ " " +donViTinh+ " " +giaMua+" " +giaBan+" " +loiNhuan;
    }

    @Override
    public int compareTo(MatHang o) {
        if (this.loiNhuan > o.loiNhuan) return 1;
        else if (this.loiNhuan < o. loiNhuan) return -1;
        else {
            int result = this.maMatHang.compareTo(o.maMatHang);
            if (result < 0) return 1;
            else return -1;
        }
    }
}
