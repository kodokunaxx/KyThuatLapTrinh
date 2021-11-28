package HuongDoiTuong.thongketukhacnhau;

import java.util.Locale;
import java.util.Scanner;
import java.util.TreeSet;

public class WordSet {
    private TreeSet<String> set = new TreeSet<>();
    public WordSet(Scanner input) {
        while (input.hasNext()) {
            set.add(input.next().toLowerCase(Locale.ROOT));
        }
    }

    @Override
    public String toString() {
        String tmp = "";
        for (String s : set) tmp += s + "\n";
        return tmp;
    }
}
