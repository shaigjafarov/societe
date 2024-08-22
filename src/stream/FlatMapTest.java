package stream;

import java.util.Collection;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class FlatMapTest {

    public static void main(String[] args) {

        Stream<List<String>> objectStream = Stream.of(List.of("a", "b", "c"), List.of("12", "45"));

        List<Student> studentList = List.of(
                new Student("Hafiz", List.of(78, 58, 89)),
                new Student("Elmir", List.of(88, 78, 80)));

        OptionalDouble average = studentList.stream().map(Student::getMarkList).flatMap(Collection::stream).mapToInt(a -> a).average();
        System.out.println(average.getAsDouble());

//        objectStream.flatMap(Collection::stream).forEach(System.out::println);

    }

}
class Student{

    String name;

    List<Integer> markList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getMarkList() {
        return markList;
    }

    public void setMarkList(List<Integer> markList) {
        this.markList = markList;
    }


    public Student(String name, List<Integer> markList) {
        this.name = name;
        this.markList = markList;
    }
}
