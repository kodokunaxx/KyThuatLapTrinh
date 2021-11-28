package HuongDoiTuong.bangtinhgiochuan;

public class MonHoc {
    private String maMon, tenMon;
    private String maGV, tongSoGio;

    public MonHoc(String maMon, String tenMon) {
        this.maMon = maMon;
        this.tenMon = tenMon;
    }

    public MonHoc(String maGV, String maMon, float tongSoGio) {
        this.maGV = maGV;
        this.maMon = maMon;
        this.tongSoGio = String.format("%.2f",tongSoGio);
    }

    public String getMaMon() {
        return maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public String getMaGV() {
        return maGV;
    }

    public String getTongSoGio() {
        return tongSoGio;
    }
}
