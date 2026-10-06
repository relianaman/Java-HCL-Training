
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class test11 {
    static void fileCheck() throws Exception {
        FileInputStream fis = new FileInputStream("D:\\a.txt");
    }
    public static void main(String[] args) {
        try {
            fileCheck();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        
    }
}
