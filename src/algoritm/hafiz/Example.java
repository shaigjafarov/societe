package algoritm.hafiz;

import java.util.*;

public class Example {

    public static void main(String[] args) {

        String text = "Hello world this is is Java";
        System.out.println(getcount(text));

    }


    public static Map<String, Integer> getcount(String text) {

        String[] words = (text.split(" "));

        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (map.containsKey(word)) {
                Integer say = map.get(word);
                map.put(word, ++say);
            } else {
                map.put(word, 1);
            }
        }

        return map;

    }

}
