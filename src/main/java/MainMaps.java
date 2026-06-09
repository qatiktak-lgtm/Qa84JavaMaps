import java.util.*;

public class MainMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> hmap = new HashMap<>();
        hmap.put("kiwi", 50);
        hmap.put("apple", 70);
        hmap.put("grape", 20);
        hmap.put("orange", 80);
        hmap.put("banana", 70);
        System.out.println(hmap);

        LinkedHashMap<String, Integer> lhmap = new LinkedHashMap<>();
        lhmap.put("kiwi", 50);
        lhmap.put("apple", 70);
        lhmap.put("grape", 20);
        lhmap.put("orange", 80);
        lhmap.put("banana", 70);
        System.out.println(lhmap);

        TreeMap<String, Integer> tmap = new TreeMap<>();
        tmap.put("kiwi", 50);
        tmap.put("apple", 70);
        tmap.put("grape", 20);
        tmap.put("orange", 80);
        tmap.put("banana", 70);
        System.out.println(tmap);

        printMap(hmap);
        printMap(lhmap);
        printMap(tmap);


    }

    private static void printMap(Map<String, Integer> map) {
        Set<String> set = map.keySet();
        for (String key: set){
            System.out.print(key + " : ");
            int value = map.get(key);
            System.out.println(value);

        }
        System.out.println("~".repeat(70));
    }
}
