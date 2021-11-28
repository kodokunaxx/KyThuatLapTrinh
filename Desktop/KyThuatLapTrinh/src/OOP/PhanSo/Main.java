package OOP.PhanSo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo a = new PhanSo(sc.nextBigInteger(), sc.nextBigInteger());
        System.out.println(a);
    }
}
