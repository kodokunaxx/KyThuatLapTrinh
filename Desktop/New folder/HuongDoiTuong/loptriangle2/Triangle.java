package HuongDoiTuong.loptriangle2;

public class Triangle {
    private Point A, B ,C;

    public Triangle(String a) {
        char[] arrToaDo = a.trim().toCharArray();
        this.A = new Point(Float.parseFloat(String.valueOf(arrToaDo[0])), Float.parseFloat(String.valueOf(arrToaDo[1])));
        this.B = new Point(Float.parseFloat(String.valueOf(arrToaDo[2])), Float.parseFloat(String.valueOf(arrToaDo[3])));
        this.C = new Point(Float.parseFloat(String.valueOf(arrToaDo[4])), Float.parseFloat(String.valueOf(arrToaDo[5])));
    }


    public float tinhKhoangCach(Point a, Point b){
        return (float) Math.sqrt((Math.pow((a.getX() -b.getX()), 2) + (Math.pow((a.getY() -b.getY()), 2))));
    }

    public boolean valid() {
        if (tinhKhoangCach(A, B) + tinhKhoangCach(A, C) > tinhKhoangCach(B, C) &&
                tinhKhoangCach(A, B) + tinhKhoangCach(B, C) > tinhKhoangCach(A, C) &&
                tinhKhoangCach(B, C) + tinhKhoangCach(A, C) > tinhKhoangCach(A, B)) return true;
        else return false;
    }

    public float getPerimeter() {
        return Math.round((tinhKhoangCach(A, B) + tinhKhoangCach(A, C)  + tinhKhoangCach(B, C))*1000f)/1000f;
    }
}
