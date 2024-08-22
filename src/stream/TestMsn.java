package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestMsn {

    public static void main(String[] args) {
        // Örnek veri kümesi: bir grup isim
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // İsimleri virgül ile ayırarak, belirli bir formatta birleştirme
        String result = names.stream()
                .collect(Collectors.joining(", ", "Names: [", "]"));

        // Sonucu ekrana yazdırma
        System.out.println(result);
        System.out.println(names);
    }
}
