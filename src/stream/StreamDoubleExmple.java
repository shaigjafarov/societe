package stream;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamDoubleExmple {


    public static void main(String[] args) {

        Stream<Integer> integerStream = Stream.generate(new Random()::nextInt);
        integerStream.limit(5).count();


        IntStream intStream = IntStream.of(11,2,3,4,6,7,9);
        LongStream longStream=  LongStream.of(11L,2L);
        DoubleStream doubleStream;



    }
}
