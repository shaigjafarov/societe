package algoritm.turkane.studentTask;

import java.util.*;
import java.util.stream.Collectors;

public class StudentUtil {
    public static List<Student> students = new ArrayList<>();
    public static List<Grade> gradeList = new ArrayList<>();

    public static void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name:");
        String name = scanner.nextLine();
        addGrade();
        Student student = new Student(name, gradeList);
        students.add(student);
        System.out.println(students);

    }

    public static void addGrade() {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("ders adi");
            String lessonName = scanner.next();
            System.out.println("ders qiymeti");
            Integer lessonMark = scanner.nextInt();

            gradeList.add(new Grade(lessonName, lessonMark));

            System.out.println("Davam etmek 'YES' or 'NO'");
            if ("NO".equalsIgnoreCase(scanner.next())) {
                break;
            }
        }
    }

    public static void studentAverage() {
        students.stream().peek(s-> System.out.print(s.getName()+" "))
                .map(student -> (student.getGradeList().stream().mapToInt(Grade::getLessonMark).sum()) / student.getGradeList().size())
                .forEach(System.out::println);
    }

//    public static void filter() {
//        List<Double> average = students.stream()
//                .map(student -> (student.getGrade().getMath() + student.getGrade().getPhysics() + student.getGrade().getInformatics()) / 3.0)
//                .filter(studentAverage -> studentAverage > 70).collect(Collectors.toList());
//        System.out.println(average);
//    }
//
//    public static void maxAverage() {
//        Optional<Student> topStudent = students.stream()
//                .max(Comparator.comparingDouble(student ->
//                        (student.getGrade().getMath() + student.getGrade().getPhysics() + student.getGrade().getInformatics()) / 3.0
//                ));
//
//        topStudent.ifPresent(student -> System.out.println("Top student: " + student.getName()));
//
//    }
}
