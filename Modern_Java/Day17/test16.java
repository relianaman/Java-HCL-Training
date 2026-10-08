
record Student(int id, String name){
}

public class test16 {
    public static void main(String[] args) {
        
        Student s1 = new Student(642, "Naman");
        Student s2 = new Student(1218, "Surendra");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
