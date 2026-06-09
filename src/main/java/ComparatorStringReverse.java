import java.util.Comparator;

public class ComparatorStringReverse implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s2.compareToIgnoreCase(s1);
    }
}
