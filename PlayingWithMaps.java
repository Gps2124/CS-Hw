import java.util.*;
public class PlayingWithMaps {
    public static void main(String[] args) {

        TreeMap<String, String> maps = new TreeMap<>();
        maps.put("adam", "Johnson");
        maps.put("bob", "Johnson");
        maps.put("john", "Ward");
        maps.put("dave", "Smith");
        System.out.println(maps);
        rarest(maps);
    }

    public static String rarest(TreeMap<String, String> strings) {

        if (strings.size() < 1)
            throw new IllegalArgumentException();
        int min = 1;
        int temp = 0;
        ArrayList<String> names = new ArrayList<String>(strings.values());
        Iterator<String> itr = names.iterator();
        TreeMap<String, Integer> map = new TreeMap<>();

        while (itr.hasNext()) {
            String s;
            s = itr.next();
            if (map.containsKey(s))
                map.put(s, map.get(s) + 1);
            else
                map.put(s, 1);
        }
        System.out.println(map);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            temp = entry.getValue();
            if (temp <= min)
                min = temp;
        }
        System.out.println(min);
        System.out.println(map.get("Smith"));
        return null;
    }
}