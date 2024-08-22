package stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStream2 {

    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1, 2, 4, 5, 6, 7, 9, 9);
        intStream.filter(a->a%2==0).forEach(System.out::println);

        Stream<Integer> integerStream = Stream.of(1, 2, 4, 5, 6, 7, 9, 9);
        integerStream.filter(a->a%2==0).forEach(System.out::println);

    }
}
