package HuongDoiTuong.tinhgio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int soLuongTest = Integer.parseInt(scanner.nextLine());
        ArrayList<gameThu> arrGamers = new ArrayList<>();

        for (int i = 0; i < soLuongTest; i++) {
            String ma = scanner.nextLine();
            String name = scanner.nextLine();
            String begin = scanner.nextLine();
            String end = scanner.nextLine();

            gameThu gamer = new gameThu();
            String tongTime = gamer.tongTime(new SimpleDateFormat("hh:mm").parse(begin),new SimpleDateFormat("hh:mm").parse(end));
            gameThu lmao = new gameThu(ma, name,tongTime);
            arrGamers.add(lmao);
        }

        Collections.sort(arrGamers);
        for (int i = arrGamers.size()-1; i >=0; i--) {
            System.out.println(arrGamers.get(i));
        }
    }
}
