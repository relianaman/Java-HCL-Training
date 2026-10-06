class parent1 {
    void fop() {
        System.out.println("Parent class executed");
    }
}

class child1 extends parent1 {
    void foc() {
        super.fop();
        System.out.println("Child class executed");
    }
}

public class test8 {
    public static void main(String[] args) {
        child1 obj = new child1();
        obj.foc();
    }
}
