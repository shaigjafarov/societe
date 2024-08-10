package stream;

import java.util.Optional;

public class OptionalExp {

    public static void main(String[] args) {
        Optional<String> test1 = Optional.of("Test");
        Optional.ofNullable("Test");
        Optional<Object> empty = Optional.empty();


        if(test1.isPresent())
            System.out.println(test1.get());

        test1.ifPresent(System.out::println);

        System.out.println( empty.orElseThrow(NullPointerException::new));




    }
}
