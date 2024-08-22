package stream;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimitiveStream {

    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 6, 7, 23, 4, 75, 43, 12, 5, 93);

        int sum = integerList.stream().mapToInt(a -> a).sum();
        System.out.println(sum);
        Stream<Integer> boxed = integerList.stream().mapToInt(a -> a).boxed();
        IntStream primitiveStream= IntStream.of(1,2,43,5,6,7);

        IntSummaryStatistics intSummaryStatistics = integerList.stream().mapToInt(a -> a).summaryStatistics();
        System.out.println(intSummaryStatistics);
        intSummaryStatistics.accept(93);
        System.out.println();
        System.out.println(intSummaryStatistics);

        DoubleStream.of(12.0,12.3,34.3);

        LongStream.range(3,15).forEach(i-> System.out.print(i+" "));
        System.out.println();
        LongStream.rangeClosed(3,15).forEach(i-> System.out.print(i+" "));

    }
}
