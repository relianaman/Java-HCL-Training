import java.io.FileOutputStream;
import java.io.IOException;

public class test9 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("D:\\a.txt");
            fos.write("Hello".getBytes());
            fos.close();
            System.out.println("Successfully wrote in file");
        } catch (IOException e) {
            System.out.println("Error writing file");
        }
    }
}
