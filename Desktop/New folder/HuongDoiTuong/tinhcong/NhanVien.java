package HuongDoiTuong.tinhcong;

public class NhanVien {
    private String maNV = "NV01";
    private String name;
    private long tienLuong;
    private long thuong;
    private long phuCap;
    private long thuNhap;

    public NhanVien(String maNV, String name, long tienLuong, long thuong, long phuCap, long thuNhap) {
        this.maNV = maNV;
        this.name = name;
        this.tienLuong = tienLuong;
        this.thuong = thuong;
        this.phuCap = phuCap;
        this.thuNhap = thuNhap;
    }

    @Override
    public String toString() {
        return  maNV + " " + name + " " + tienLuong + " " + thuong +" "+ phuCap + " " + thuNhap;
    }
}
