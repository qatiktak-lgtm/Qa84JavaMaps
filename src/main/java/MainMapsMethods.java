import java.util.LinkedHashMap;
import java.util.Set;

public class MainMapsMethods {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhmap = new LinkedHashMap<>();
        lhmap.put("kiwi", 50);
        lhmap.put("apple", 70);
        lhmap.put("grape", 20);
        lhmap.put("orange", 80);
        lhmap.put("banana", 70);

        System.out.println(lhmap);

        int value = lhmap.get("grape");
        System.out.println(value);

        lhmap.put("banana", 20);
        System.out.println(lhmap);

        boolean res = lhmap.containsKey("apple");
        System.out.println(res);

        Set<String> keys = lhmap.keySet();
        System.out.println(keys);

        lhmap.remove("orange");
        System.out.println(lhmap);

        lhmap.remove("grape",10);
        System.out.println(lhmap);

        lhmap.replace("grape", 45);
        System.out.println(lhmap);

        lhmap.replace("grape", 45,67);
        System.out.println(lhmap);

    }
}
