import java.util.Set;
import java.util.TreeMap; // можно поставить * вместо TreeMap чтобы было меньше импортов

public class MainStringMap {
    public static void main(String[] args) {
        printCharsValues("caabbcaabbc");
        printWordReverse("hello any hello bye hello bye bye any");


/*
    "hello any hello bye hello bye bye any" (в обратном алф.порядке)
            0     1    2      3     4     5     6   7
    ar->[hello][any][hello][bye][hello][bye][bye][any]
    hello = 3   |
    bye = 3     | а нужно =>
    any = 2     |
 отдельный компаратор делают когда нужен особый порядок сортировки
 */
    }

    public static void printWordReverse(String s) {
        ComparatorStringReverse comp = new ComparatorStringReverse();
        TreeMap<String, Integer> map = new TreeMap<>(comp);
        String[] ar = s.split(" ");
        for (String str : ar) {
            if (map.containsKey(str) == false) {
                map.put(str, 1);
            } else {
                int value = map.get(str);
                value++;
                map.replace(str, value);
            }
        }
        //теперь нужно распечатать нов обратном алф.порядке
        //Возможен вариант с: Set<String> keys = map.descendingKeySet();
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.print(key + " = ");
            int value = map.get(key);
            System.out.println(value);
        }


    }

    public static void printCharsValues(String s) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        //заполнение Map (почему мы взяли TreeMap?)
        for (int i = 0; i < s.length(); i++) {
            char sym = s.charAt(i);
            if (map.containsKey(sym) == false) {
//                map.put(sym, 1); // Вариант с put - лучше для добавления новых
//            } else {
                int value = map.get(sym);
                value++;
                map.replace(sym, value); // replace лучше для изменения уже существующих (с защитой от ...
            }
        }
        // первая часть задачи решена, далее распечатка
        Set<Character> keys = map.keySet(); // будет выглядеть так: keys-> [a, b, c]]
        for (char key : keys) {
            System.out.print(key + "->");
            int value = map.get(key);
            System.out.println(value);
        }

    }
}



/*

public static void printCharsValues(String s)
i++
012345678910
s-> "caabbcaabbc"
to print by abc(use map):
               map
             key  value
             -----------
             a      4
             b      4
             c      3

"caabbcaabbc"
a->4
b->4

c->3
 */