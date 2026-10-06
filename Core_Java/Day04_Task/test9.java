class parent {
    @SuppressWarnings("unused")
    int age;
}

class child extends parent {
    void foc() {
        super.age = 22;
        System.out.println("The age is: " + age);
        System.out.println("Child class executed");
    }
}

public class test9 {
    public static void main(String[] args) {
        child obj = new child();
        obj.foc();
    }
}