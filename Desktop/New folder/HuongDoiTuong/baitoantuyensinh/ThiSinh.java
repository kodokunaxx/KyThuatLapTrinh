package HuongDoiTuong.baitoantuyensinh;

public class ThiSinh {
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

    @Override
    public String toString() {
        return maTS + " " +ten + " " + diemUuTien + " "+ tongDiem + " "+ status;
    }
}
