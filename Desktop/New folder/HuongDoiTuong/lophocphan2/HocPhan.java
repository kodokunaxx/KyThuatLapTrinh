package HuongDoiTuong.lophocphan2;

public class HocPhan implements Comparable<HocPhan>{
    private String maMonHoc, name, giangVien;
    private int nhom;


    public HocPhan(String maMonHoc, String name, int nhom, String giangVien) {
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

    public int getNhom() {
        return nhom;
    }

    public String getGiangVien() {
        return giangVien;
    }

    @Override
    public String toString() {
        return  maMonHoc + " " + name + " " + " "+ String.format("%02d", nhom);
    }

    @Override
    public int compareTo(HocPhan o) {
        int result = this.maMonHoc.compareTo(o.maMonHoc);
        if (result > 0) return 1;
        else if (result < 0) return -1;
        else {
            if (this.nhom > o.nhom) return 1;
            else return -1;
        }
    }
}
