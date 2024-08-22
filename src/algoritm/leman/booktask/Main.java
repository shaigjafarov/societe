package algoritm.leman.booktask;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Vampire Diaries ", 180),
                new Book("Lord of The Rings ", 1225),
                new Book("Cursed child ", 214),
                new Book("To Kill a Mockingbird", 281)
        );

        // 1. Səhifələrin ümumi sayını hesablayın.
        int totalPageCount = books.stream()
                .mapToInt(Book::getPageCount)
                .sum();


        Integer reduce = books.stream()
                .map(Book::getPageCount)
                .reduce(Integer::sum).get();

        System.out.println(reduce);
        System.out.println("Səhifələrin ümumi sayı: " + totalPageCount);

        // 2. 200 səhifədən çox olan kitabları filter edin.
        List<Book> booksMoreThan200Pages = books.stream()
                .filter(book -> book.getPageCount() > 200)
                .toList();

        // 3. Bu kitabların adlarını alfabetik ardıcıllıqla çap edin.
        booksMoreThan200Pages.stream()
                .map(Book::getName)
                .sorted()
                .forEach(System.out::println);
    }
}
