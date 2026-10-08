package Day03;

public class test3 {
    String voice;
    
    void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        test3 obj = new test3();
        obj.sound();
        obj.voice = "Meaw";
        System.out.println(obj.voice);
    }
}
