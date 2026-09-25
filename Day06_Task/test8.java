
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class test8 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:\\a.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        
    }
}
