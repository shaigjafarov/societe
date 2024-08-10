package algoritm.turkane.studentTask;

import java.util.StringJoiner;

public class Grade {
    private int math;
    private int physics;
    private int informatics;

    public Grade() {
    }

    public Grade(int math, int physics, int informatics) {
        this.math = math;
        this.physics = physics;
        this.informatics = informatics;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public int getInformatics() {
        return informatics;
    }

    public void setInformatics(int informatics) {
        this.informatics = informatics;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Grade.class.getSimpleName() + "[", "]")
                .add("math=" + math)
                .add("physics=" + physics)
                .add("informatics=" + informatics)
                .toString();
    }
}
