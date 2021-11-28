package HuongDoiTuong.sapxepketquatuyensinh;

public class ThiSinh implements Comparable<ThiSinh>{
    private String maTS, ten, toan, ly, hoa;
    private String diemUuTien, tongDiem, status;

    public ThiSinh(String maTS, String ten, float toan, float ly, float hoa) {
        this.maTS = maTS;
        this.ten = ten;
        this.toan = String.format("%.1f", toan);
        this.ly = String.format("%.1f", ly);
        this.hoa = String.format("%.1f", hoa);
    }

    public ThiSinh(String maTS, String ten, float diemUuTien, float tongDiem, String status) {
        this.maTS = maTS;
        this.ten = ten;
        this.diemUuTien = String.format("%.1f", diemUuTien);
        this.tongDiem = String.format("%.1f", tongDiem);
        this.status = status;
    }

    public String getMaTS() {
        return maTS;
    }

    public String getTen() {
        return ten;
    }

    public String getToan() {
        return toan;
    }

    public String getLy() {
        return ly;
    }

    public String getHoa() {
        return hoa;
    }

    public String getDiemUuTien() {
        return diemUuTien;
    }

    public String getTongDiem() {
        return tongDiem;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return this.maTS + " " +this.ten + " " + this.diemUuTien + " "+ this.tongDiem + " "+ status;
    }

    @Override
    public int compareTo(ThiSinh o) {
        int result =  this.tongDiem.compareTo(o.tongDiem);
        if (result > 0) return 1;
        else if (result < 0) return -1;
        else {
           return maTS.compareTo(o.maTS);
        }
    }
}
