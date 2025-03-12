package Collection;

import java.util.HashMap;
import java.util.Map;

public class TestingMap {
    public static void main(String[] args) {
        Map<String , Integer> map = new HashMap<>();
        map.put("vikash", 34);
        map.put("sarvar" , 246);
        System.out.println(map.size());
        System.out.println(map.get("vikash"));
        System.out.println(map.get("sarvar")); // get value
        System.out.println(map.containsKey("ram")); // check is exist or not
        map.remove("vikash"); // for rmove the key value
        System.out.println(map.get("vikash"));
        System.out.println(map.size());


        for (String s : map.keySet()) {
            System.out.printf("%s %s" , s , map.get(s));

        }
    }
}
