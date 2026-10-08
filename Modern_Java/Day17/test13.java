public class test13 {

    record Student(int id, String name, int marks) {
    }
    
    public static void main(String[] args) {
        
        Student s1 = new Student(642, "Naman", 89);

        System.out.println("ID    : " + s1.id());
        System.out.println("Name  : " + s1.name());
        System.out.println("Marks : " + s1.marks());
    }
}
