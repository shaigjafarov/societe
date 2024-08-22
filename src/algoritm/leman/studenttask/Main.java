package algoritm.leman.studenttask;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Alice", Arrays.asList(85, 90, 80)),
                new Student("Bob", Arrays.asList(70, 60, 75)),
                new Student("Charlie", Arrays.asList(95, 100, 90)),
                new Student("David", Arrays.asList(50, 65, 55))
                );

        // 1. Hər bir tələbənin orta qiymətini hesablayın.
        students.forEach(student -> {
            System.out.println(student.getName() + " orta qiyməti: " + student.getAverageGrade());
        });

        // 2. Orta qiyməti 70 və ya yuxarı olan tələbələrin siyahısını yaradın.
        List<Student> studentsWithHighAverage = students.stream()
                .filter(student -> student.getAverageGrade() >= 70)
                .toList();

        // 3. Bu tələbələrin adlarını və orta qiymətlərini çap edin.
        System.out.println("Orta qiyməti 70 və ya yuxarı olan tələbələr:");
        studentsWithHighAverage.forEach(student -> {
            System.out.println(student.getName() + " orta qiyməti: " + student.getAverageGrade());
        });
    }
}