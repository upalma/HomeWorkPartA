package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MakingHashMap {
    public static void main(String[] args) {

    Map<Integer, String> hashMap = new HashMap<Integer, String>();

    hashMap.put(1, "USA, UK");
    hashMap.put(2, "Australia");
    hashMap.put(3, "Natherland");
    hashMap.put(4, "France");

    for(Map.Entry <Integer, String> map:hashMap.entrySet()) {
        System.out.println(map.getKey()+ " -- "+ map.getValue());
        }
    }
}
