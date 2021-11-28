package HuongDoiTuong.loptriangle2;

import java.util.Scanner;

public class Point {
    private float x, y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public static Point nextPoint(Scanner scanner) {
        return new Point(scanner.nextFloat(), scanner.nextFloat());
    }
}
