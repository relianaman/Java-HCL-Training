interface Printable {
    public void print();
}

record Student(int id, String name, int marks) implements Printable{

    @Override 
    public void print() {
        System.out.println(id + " " + name + " " + marks);
    }

}

public class test15 {
    public static void main(String[] args) {
        Student obj = new Student(642, "Naman", 89);
        obj.print();
    }
}