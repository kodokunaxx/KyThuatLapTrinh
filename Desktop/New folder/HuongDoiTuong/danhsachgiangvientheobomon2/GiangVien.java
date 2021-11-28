package HuongDoiTuong.danhsachgiangvientheobomon2;

public class GiangVien {
    private String ma, name, mon;

    public GiangVien(int ma, String name, String mon) {
        this.ma = String.format("%02d",ma);
        this.name = name;
        this.mon = mon;
    }

    public String getMa() {
        return ma;
    }

    public String getName() {
        return name;
    }

    public String getMon() {
        return mon;
    }

    @Override
    public String toString() {
        return "GV" +ma+ " " +name+ " " +mon;
    }
}
