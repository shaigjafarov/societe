package stream;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {

    public static void main(String[] args) {

        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        Stream<Integer> peek = integers.stream()
                .peek(System.out::println)
                .filter(number->number%2==0)
                .peek(System.out::println);


        System.out.println("Kodun sonu");
        peek.collect(Collectors.toList());
    }
}
