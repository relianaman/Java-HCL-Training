package marksheet;

public sealed abstract class Marksheet permits Semester1, Semester2, Semester3, Semester4, Semester5, Semester6 {

    protected Student student;

    public Marksheet(Student student) {
        this.student = student;
    }

    public abstract void display();
}