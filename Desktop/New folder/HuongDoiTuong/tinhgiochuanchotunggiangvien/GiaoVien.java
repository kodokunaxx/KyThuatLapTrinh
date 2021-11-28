package HuongDoiTuong.tinhgiochuanchotunggiangvien;

public class GiaoVien {
    private String maGV, tenGV;
    private String tongGio;

    public GiaoVien(String maGV, String tenGV) {
        this.maGV = maGV;
        this.tenGV = tenGV;
    }

    public String getMaGV() {
        return maGV;
    }

    public String getTenGV() {
        return tenGV;
    }

    public String getTongGio() {
        return tongGio;
    }
}
