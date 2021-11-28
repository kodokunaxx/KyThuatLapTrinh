package HuongDoiTuong.bangdiemhocsinh;

public class HocSinh implements Comparable<HocSinh> {
    private String ma;
    private String ten;
    private String toan, tiengViet, ngoaiNgu, vatLy, hoaHoc, sinhHoc, lichSu, diaLy, gdcd, congNghe;
    private String diemTB;
    private String xepHang;

    public HocSinh(int ma, String ten, float toan, float tiengViet, float ngoaiNgu, float vatLy, float hoaHoc, float sinhHoc, float lichSu, float diaLy, float gdcd, float congNghe) {
        this.ma = String.format("%02d", ma);
        this.ten = ten;
        this.toan = String.format("%.1f",toan);
        this.tiengViet =  String.format("%.1f",tiengViet);
        this.ngoaiNgu =  String.format("%.1f",ngoaiNgu);
        this.vatLy =  String.format("%.1f",vatLy);
        this.hoaHoc =  String.format("%.1f",hoaHoc);
        this.sinhHoc =  String.format("%.1f",sinhHoc);
        this.lichSu =  String.format("%.1f",lichSu);
        this.diaLy =  String.format("%.1f",diaLy);
        this.gdcd =  String.format("%.1f",gdcd);
        this.congNghe =  String.format("%.1f",congNghe);
    }

    public HocSinh(String ma, String ten, float diemTB, String xepHang) {
        this.ma = ma;
        this.ten = ten;
        this.diemTB = String.format("%.1f", diemTB);
        this.xepHang = xepHang;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public String tinhDiemTB() {
        float diemTBFloat =(float) Math.round((((Float.parseFloat(toan)*2) + (Float.parseFloat(tiengViet)*2) + (Float.parseFloat(ngoaiNgu)) + (Float.parseFloat(vatLy))
                +(Float.parseFloat(hoaHoc)) +(Float.parseFloat(sinhHoc)) + (Float.parseFloat(lichSu)) + (Float.parseFloat(diaLy)) + (Float.parseFloat(gdcd)) +
                (Float.parseFloat(congNghe))) /12) *10f)/10f;
        return String.format("%.1f", diemTBFloat);
    }

    @Override
    public String toString() {
        return "HS" +ma + " " + ten + " " +diemTB + " "+ xepHang;
    }


    @Override
    public int compareTo(HocSinh o) {
        if ( this.diemTB.compareTo(o.diemTB) > 0 )
            return 1;
        else if ( this.diemTB.compareTo(o.diemTB) < 0 )
            return -1;
        else {
            if (this.ma.compareTo( o.ma) < 0)
                return 1;
            else
                return -1;
        }
    }
}
