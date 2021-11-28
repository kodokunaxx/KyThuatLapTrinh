package HuongDoiTuong.danhsachgiangvientheobomon;

public class GiangVien {
    private String name, mon;
    private String ma;

    public GiangVien(String name, String mon) {
        this.name = name;
        this.mon = mon;
    }

    public GiangVien(int ma, String name,String mon) {
        this.ma = "GV" + String.format("%02d", ma);
        this.name = name;
        this.mon = mon;
    }

    public String getName() {
        return name;
    }

    public String getMon() {
        return mon;
    }

    public String getMa() {
        return ma;
    }
}
