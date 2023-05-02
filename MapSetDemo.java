import java.util.*;

public class MapSetDemo {
    public static void main(String[] args) {
        HashMap hm=new HashMap();
        hm.put("Snega", 101);
        hm.put("Deepika", 102);
        hm.put("Kaviya", 103);
        System.out.println("Map are "+hm);
        System.out.println(hm.containsKey("Deepika"));
        System.out.println(hm.containsValue(108));
        Set s=hm.keySet();
        System.out.println("Keys are "+s);
        Collection c = hm.values();
        System.out.println("Values are "+c);
        Set s2= hm.entrySet();
        System.out.println("Entries are "+s2);
        Iterator i = s2.iterator();
        while (i.hasNext()){
            Map.Entry me = (Map.Entry) i.next();
            //System.out.println("Iterator " +i.next());
            System.out.println("me.getKey()" +  " : " + "me.getValue()");
        }
    }
}
