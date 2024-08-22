package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupFunction {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Sayıları çift ve tek olarak gruplandırma
        Map<Boolean, List<Integer>> groupedByEvenOdd = numbers.stream()
                .collect(Collectors.groupingBy(num -> num % 2 == 0));

        // Sonuçları ekrana yazdırma
        System.out.println("Çift Sayılar: " + groupedByEvenOdd.get(true));
        System.out.println("Tek Sayılar: " + groupedByEvenOdd.get(false));



    }
}
