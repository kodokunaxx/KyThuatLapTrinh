package HuongDoiTuong.lophocphan1;

public class HocPhan implements Comparable<HocPhan>{
    private String  maMonHoc, name, nhom, giangVien;


    public HocPhan(String maMonHoc, String name, String nhom, String giangVien) {
        this.maMonHoc = maMonHoc;
        this.name = name;
        this.nhom = nhom;
        this.giangVien = giangVien;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return nhom + " " + giangVien;
    }

    @Override
    public int compareTo(HocPhan o) {
        return this.nhom.compareTo(o.nhom);
    }
}
