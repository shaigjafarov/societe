package algoritm.turkane.studentTask;

import java.util.StringJoiner;

public class Grade {

    private String lessonName;

    private Integer lessonMark;

    public Grade() {
    }

    public Grade(String lessonName, Integer lessonMark) {
        this.lessonName = lessonName;
        this.lessonMark = lessonMark;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public Integer getLessonMark() {
        return lessonMark;
    }

    public void setLessonMark(Integer lessonMark) {
        this.lessonMark = lessonMark;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "lessonName='" + lessonName + '\'' +
                ", lessonMark='" + lessonMark + '\'' +
                '}';
    }
}
