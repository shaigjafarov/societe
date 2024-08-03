package test;

import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionalInterfaces {

    public static void main(String[] args) {

        Function<String,String> upperFunction= String::toUpperCase;
        Function<String,Integer> lengthFunction= String::length;
        BiFunction<String,String,Integer> sumFunction= (a,b)->a.concat(b).length();

        UnaryOperator<String> lowerUnaryOperator= String::toLowerCase;

        String str = upperFunction.apply("salam");

        System.out.println(str);
        System.out.println(lengthFunction.apply("sdkjbfjsd"));
        System.out.println(lowerUnaryOperator.apply("ALKSNFDOASD"));


        Consumer<String> ekran = System.out::println;
        ekran.accept("asdvk");

        Consumer<Integer> toConsoleConsumer = System.out::println;



        Supplier<Integer> randomGenerateSupplier= ()->new Random().nextInt();

        toConsoleConsumer.accept(randomGenerateSupplier.get());

    }
}
