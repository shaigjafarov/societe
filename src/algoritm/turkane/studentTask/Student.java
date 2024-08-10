package algoritm.turkane.studentTask;

import java.util.List;
import java.util.StringJoiner;

public class Student {
    private String name;
    private List<Grade> gradeList;

    public Student() {
    }

    public Student(String name, List<Grade> gradeList) {
        this.name = name;
        this.gradeList = gradeList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Grade> getGradeList() {
        return gradeList;
    }

    public void setGradeList(List<Grade> gradeList) {
        this.gradeList = gradeList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradeList=" + gradeList +
                '}';
    }
}
