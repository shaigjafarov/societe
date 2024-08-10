package stream;

import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class InfiniteStream {

    public static void main(String[] args) {
//
//        UUID uuid = UUID.randomUUID();
//        System.out.println(uuid);
//       Stream.generate(UUID::randomUUID).limit(10).forEach(System.out::println);
//
//


        Random random = new Random();
//        System.out.println( random.nextInt(10));
//        System.out.println( random.nextInt(10));
//
        Supplier<Integer> randomGen=()->random.nextInt(10);

         Stream.generate(randomGen).peek(System.out::println).allMatch((a->a==1));

//        System.out.println(integer.get());


    }


}
