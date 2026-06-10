package home_work_15;

import java.util.*;
import java.util.AbstractMap.SimpleEntry;

public class MainMapsCollection {
    public static void main(String[] args) {
        HashMap<String, Integer> citi_h = new HashMap<>();
        citi_h.put("Jericho (Palestine)", 11000);
        citi_h.put("Damascus (Syria)", 10000);
        citi_h.put("Byblos (Lebanon)", 7000);
        citi_h.put("Athens (Greece)", 5000);
        citi_h.put("Susa (Iran)", 6200);
        citi_h.put("Plovdiv (Bulgaria)", 6000);
        citi_h.put("Faiyum (Egypt)", 6000);
        citi_h.put("Faiyum (Egypt)", 6000);
        System.out.println(citi_h);

        SimpleEntry<String, Integer>[] citiArray = new SimpleEntry[]{
                new SimpleEntry<>("Jericho (Palestine)", 11000),
                new SimpleEntry<>("Damascus (Syria)", 10000),
                new SimpleEntry<>("Byblos (Lebanon)", 7000),
                new SimpleEntry<>("Athens (Greece)", 5000),
                new SimpleEntry<>("Susa (Iran)", 6200),
                new SimpleEntry<>("Plovdiv (Bulgaria)", 6000),
                new SimpleEntry<>("Faiyum (Egypt)", 6000),
                new SimpleEntry<>("Faiyum (Egypt)", 6000)};
        LinkedHashMap<String, Integer> citi_l = new LinkedHashMap<>();
        for (SimpleEntry<String, Integer> entry : citiArray) {
            citi_l.put(entry.getKey(), entry.getValue());
        }

        TreeMap<String, Integer> citi_t = new TreeMap<>();
        citi_t.put("Jericho (Palestine)", 11000);
        citi_t.put("Damascus (Syria)", 10000);
        citi_t.put("Byblos (Lebanon)", 7000);
        citi_t.put("Athens (Greece)", 5000);
        citi_t.put("Susa (Iran)", 6200);
        citi_t.put("Plovdiv (Bulgaria)", 6000);
        citi_t.put("Faiyum (Egypt)", 6000);
        citi_t.put("Faiyum (Egypt)", 6000);

        System.out.println();
        System.out.println("The oldest cities in the world:");
        System.out.println("~".repeat(70));

        printCities(citi_h);
        printCities(citi_l);
        printCities(citi_t);

    }

    private static void printCities(Map<String, Integer> citi) {
        Set<String> set = citi.keySet();
        for (String x: set){
            System.out.print(x + " founded => ");
            int year = citi.get(x);
            System.out.println(year + " years ago.");
        }
        System.out.println("~".repeat(70));
    }
}
