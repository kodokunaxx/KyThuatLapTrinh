package OOP.DanhSachMatHang;

public class DanhSachMatHang {
    private String ma;
    private String ten;
    private String dv;
    private int giaban;
    private int giamua;
    private int loinhuan;

    public DanhSachMatHang(int ma, String ten, String dv, int giamua, int giaban) {
        this.ma = String.format("MH%03d", ma);
        this.ten = ten;
        this.dv = dv;
        this.giaban = giaban;
        this.giamua = giamua;
        tinhloinhuan(giamua,giaban);
    }

    private void tinhloinhuan(int giamua, int giaban) {
        this.loinhuan=giaban-giamua;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+dv+" "+giamua+" "+giaban+" "+loinhuan;
    }

    public int getLoinhuan() {
        return loinhuan;
    }

    public String getMa() {
        return ma;
    }
    
    
}
