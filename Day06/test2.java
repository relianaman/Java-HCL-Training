
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class test2 {
    public static void main(String[] args) {
        try {
            @SuppressWarnings({ "unused", "resource" })
            FileInputStream fis = new FileInputStream("D:\\a.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        
    }
}
