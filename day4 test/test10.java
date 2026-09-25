class parent {
    parent() {
        super();
        System.out.println("Parent printed");
    }
}

class child extends parent{
    child() {
        System.out.println("Child printed");
    }
}

public class test10 {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        child obj = new child();
    }
}
