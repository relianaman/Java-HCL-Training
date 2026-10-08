public class test12 {
    public static void main(String[] args) {
        
        String name = "Naman";
        int marks = 85;
        String course = "Java";

        String report = """
                ======================
                    Student Report 
                ======================
                Name   : %s
                Course : %s
                Marks  : %d
                Result : Pass
                """.formatted(name, course, marks);

        System.out.println(report);
    }
}
