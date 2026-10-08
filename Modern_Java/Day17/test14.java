public class test14 {
    
    record Student(int id, String name,  int marks) {

        public boolean isPassed() {
            return marks >= 40;
        }
    }

    public static void main(String[] args) {
        
        Student s = new Student(642, "Naman", 89);

        System.out.println(s.name());
        System.out.println("Passed: " + s.isPassed());
    }
}
