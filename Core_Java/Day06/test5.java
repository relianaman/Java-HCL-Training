package Day06;

public class test5 {
    @SuppressWarnings("null")
    public static void main(String[] args) {
 
        try {
            String name = null;
            String name1 = "HCL";
            System.out.println(name.length());
            System.out.println(name1.length());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}