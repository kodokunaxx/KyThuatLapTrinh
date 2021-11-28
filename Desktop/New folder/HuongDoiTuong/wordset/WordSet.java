package HuongDoiTuong.wordset;

import java.util.Locale;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class WordSet {
    private TreeSet<String> set = new TreeSet<>();

    public WordSet() {
    }

    public WordSet(String s) {
        StringTokenizer st = new StringTokenizer(s.toLowerCase(Locale.ROOT));
        while (st.hasMoreTokens()) set.add(st.nextToken());
    }

    public String toString() {
        String kq = "";
        for (String i : set) kq = kq + i + " ";
        return kq.trim();
    }

    public WordSet union(WordSet a) {
        WordSet result = new WordSet();
        result.set.addAll(set);
        result.set.addAll(a.set);
        return result;
    }

    public WordSet intersection(WordSet a) {
        WordSet result = new WordSet();
        result.set.addAll(set);
        result.set.retainAll(a.set);
        return result;
    }
}
