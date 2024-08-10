package algoritm.turkane.booksTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BookUtil {
    public static List<Book> list=new ArrayList<>();

    public static void addBook(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the name of book:");
        String name=scanner.nextLine();
        System.out.println("Please enter page count of book:");
        int pageCount=scanner.nextInt();
        Book book=new Book(name,pageCount);
        list.add(book);
        System.out.println(list);
    }
    public static void allPageCount(){
       int countPage= list.stream().mapToInt(Book::getPageCount).sum();
        System.out.println("Total page:"+countPage);
    }
    public static void filter(){
        List<Book> filterList=list.stream()
                .filter(list->list.getPageCount()>200)
                .collect(Collectors.toList());
        System.out.println(filterList);
    }
    public static void sortBook(){
        list.stream()
                .map(Book::getName)
                .sorted()
                .toList()
                .forEach(System.out::println);
    }
}
