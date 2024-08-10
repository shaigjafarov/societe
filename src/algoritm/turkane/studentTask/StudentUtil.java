package algoritm.turkane.studentTask;

import java.util.*;
import java.util.stream.Collectors;

public class StudentUtil {
    public static List<Student> students=new ArrayList<>();
    public static List<Grade> grades=new ArrayList<>();
    public static void addStudent(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter student name:");
        String name= scanner.nextLine();
        Grade grade=addGrade();
        Student student=new Student(name,grade);
        students.add(student);
        System.out.println(students);

    }
    public static Grade addGrade(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter student's Math grade:");
        int math= scanner.nextInt();
        System.out.println("Enter student's Physics grade:");
        int physics= scanner.nextInt();
        System.out.println("Enter student's Informatics grade:");
        int informatics= scanner.nextInt();
        Grade grade=new Grade(math,physics,informatics);
        return grade;
    }

    public static void studentAverage(){
                students.stream()
                .map(student -> (student.getGrade().getMath()+student.getGrade().getPhysics()+student.getGrade().getInformatics())/3.0)
                .forEach(studentAverage-> System.out.println(studentAverage));
    }
    public static void filter(){
      List<Double> average=  students.stream()
                .map(student -> (student.getGrade().getMath()+student.getGrade().getPhysics()+student.getGrade().getInformatics())/3.0)
                .filter(studentAverage ->studentAverage>70).collect(Collectors.toList());
        System.out.println(average);
    }
    public static void maxAverage(){
        Optional<Student> topStudent = students.stream()
                .max(Comparator.comparingDouble(student ->
                        (student.getGrade().getMath() + student.getGrade().getPhysics() + student.getGrade().getInformatics()) / 3.0
                ));

        topStudent.ifPresent(student -> System.out.println("Top student: " + student.getName()));

    }
}
