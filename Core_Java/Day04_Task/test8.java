package Day04_Task;

class parent {
    void fop() {
        System.out.println("Parent class executed");
    }
}

class child extends parent {
    void foc() {
        super.fop();
        System.out.println("Child class executed");
    }
}

public class test8 {
    public static void main(String[] args) {
        child obj = new child();
        obj.foc();
    }
}