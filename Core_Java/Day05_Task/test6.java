package Day05_Task;

class parent {
    void show() {
        System.out.println("Parent class executed");
    }
}

class child extends parent {
    @Override 
    void show() {
        super.show();
        System.out.println("Child class executed");
    }
}

public class test6 {
    public static void main(String[] args) {
        child obj = new child();
        obj.show();
    }
}
