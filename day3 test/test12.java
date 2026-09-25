public class test12 {
    
    String name;

    test12(String n) {
        
        name = n;
    }

    void display() {
        System.out.println("Name: " + name);
        

    }

    public static void main(String[] args) {
        test12 obj = new test12("Naman");
        obj.display();
    }

}
