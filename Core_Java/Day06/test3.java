package Day06;

public class test3 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
