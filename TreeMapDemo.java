import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap();
        tm.put(1001, "Swassthika");
        tm.put(1002, "Anjana");
        TreeMap tm2 = new TreeMap();
        tm2.putAll(tm);
        System.out.println(tm2);
    }
}
