public class test11 {
    public static void main(String[] args) {
        
        // traditionally multiline string
        String message = "Hello Students\n"
                        + "Welcome to Java\n" 
                        + "Today we are learning Text Block";
        System.out.println(message);
        System.out.println();

        // text block - java 15
        String message1 = """
                        Hello Students
                        Welcome to Java
                        Today we are learning Text Block
                        """;
        System.out.println(message1);

        // text block with json
        String json = "{\n"
                        + " \"name\": \"Naman\",\n"
                        + " \"age\": 22,\n"
                        + " \"course\": \"Java\",\n"
                        +"}";
        System.out.println(json);   
        System.out.println();     

        //text block with sql
        String sql = "SELECT id, name, salary "
                        + "FROM employee "
                        + "WHERE salary > 5000 " 
                        + "ORDER BY salary DESC ";
        System.out.println(sql);
        System.out.println();
        

        // text block with string formatter
        String name = "Naman";
        double salary = 35000;
        String result = """
                Employee Details
                ----------------
                Name   : %s
                Salary : %.2f
                """.formatted(name, salary);
        System.out.println(result);
        System.out.println();

        String text = """
                Java
                Python
                C++
                """;
        System.out.println(text);
    }
}
