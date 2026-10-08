package Day04_Task;

class parent {
    parent() {
        super();
        System.out.println("Parent printed");
    }
}

class child extends parent{
    child(int b) {
        System.out.println("The number is: " + b);
        System.out.println("Child printed");
    }
}

public class test11 {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        child obj = new child(10);
    }
}
