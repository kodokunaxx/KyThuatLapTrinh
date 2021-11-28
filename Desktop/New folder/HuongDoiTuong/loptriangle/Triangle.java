package HuongDoiTuong.loptriangle;

public class Triangle {
    private Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean valid() {
        if (tinhKhoangCach(a, b) + tinhKhoangCach(b, c) > tinhKhoangCach(a, c) &&
                tinhKhoangCach(b, c) + tinhKhoangCach(c, a) > tinhKhoangCach(a, b) &&
                tinhKhoangCach(c, a) + tinhKhoangCach(a, b) > tinhKhoangCach(b, c))
            return true;
        return false;
    }

    public float getPerimeter() {
        return Math.round((tinhKhoangCach(a, b) + tinhKhoangCach(b, c) + tinhKhoangCach(a, c))*1000f)/1000f;
    }

    private float tinhKhoangCach(Point a, Point b){
        return (float) Math.sqrt(Math.pow(a.getX()-b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }

    //CT tinh dien tich: sqrt(p*(p-a)*(p-b)*(p-c)) voi p = (a+b+c)/2;
}
