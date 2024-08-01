package Hashmap;

import java.util.HashMap;
import java.util.Map;


public class Main {
      public static   Map<String, Integer> getCount(String text) {
            String[] words = text.split(" ");
            HashMap<String, Integer> map = new HashMap<>();
            for (String word : words) {
                if (map.containsKey(word)) {
                    Integer say = map.get(word);
                    map.put(word, ++say);
                } else
                    map.put(word, 0);
            }
            return map;
    }

}
