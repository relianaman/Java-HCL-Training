package Day06;

public class test6 {
    public static void main(String[] args) {
        try {
            int a = 100, b = 0, c;
            c = a/b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
            // e.printStackTrace(); // print exception name + description + stack trace
            // System.out.println(e.toString()); // print exception name + description
            // System.out.println(e.getMessage()); // print description
        }
    }
}
