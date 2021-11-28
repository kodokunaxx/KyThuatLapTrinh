package OOP.ThuNhapGiaoVien;

public class GiaoVien {
    private String ma, ten;
    private int bacluong, thunhap, phucap;

    public GiaoVien(String ma, String ten, int luongcb) {
        this.ma = ma;
        this.ten = ten;
        this.bacluong = Integer.parseInt(ma.substring(2,4));
        switch (ma.substring(0,2)){
            case "HT":
                this.phucap = 2000000;
                break;
            case "HP":
                this.phucap = 900000;
                break;
            case "GV":
                this.phucap = 500000;
                break;
            default:
                break;
        }
        this.thunhap = phucap + luongcb*bacluong;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + bacluong + " " + phucap + " " + thunhap;
    }
}
