package HuongDoiTuong.timthukhoakithi;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int soThiSinh = Integer.parseInt(scanner.nextLine());
        ArrayList<ThiSinh> arrTS = new ArrayList<>();
        for (int i = 1; i <= soThiSinh; i++) {
            String name = scanner.nextLine();
            String birthday = scanner.nextLine();
            float x1 = scanner.nextFloat();
            float x2 = scanner.nextFloat();
            float x3 = scanner.nextFloat();
            scanner.nextLine();
            float tong =  x1 + x2 + x3;
            
            arrTS.add(new ThiSinh(i, name,birthday,tong));
        }

        Collections.sort(arrTS);
        for (int i = 0; i < arrTS.size(); i++) {
            if (arrTS.get(i).getTong() == arrTS.get(arrTS.size()-1).getTong()) {
                System.out.println(arrTS.get(i));
            }
        }
    }
}
