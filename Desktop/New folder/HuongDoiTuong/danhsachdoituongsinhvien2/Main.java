package HuongDoiTuong.danhsachdoituongsinhvien2;


import java.text.ParseException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList<SinhVien> arrSV = new ArrayList<>();
        for (int i = 1; i <= n ; i++) {
            String name = scanner.nextLine().trim().replaceAll("\\s+", " ").toLowerCase(Locale.ROOT);

            String[] arrWords = name.split(" ");
            String realName = "";
            for (int j = 0; j < arrWords.length; j++) {
                realName += String.valueOf(arrWords[j].charAt(0)).toUpperCase(Locale.ROOT)+ arrWords[j].substring(1)+ " ";
            }
            String lop = scanner.nextLine();
            String birthday = scanner.nextLine();
            String gpa = scanner.nextLine();

            SinhVien sv = new SinhVien(i, realName, lop, birthday,gpa);
            arrSV.add(sv);
        }

        for (int i = 0; i < arrSV.size(); i++) {
            System.out.println(arrSV.get(i));
        }
    }
}
