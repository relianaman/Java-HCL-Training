package Day04_Task;

class parent {
    protected int age;

    protected void display() {
        age = 10;
        System.out.println("The age is: " + age);
    }
}

class child extends parent {
    void show() {
        display();
    }
}

public class test15 {
    public static void main(String[] args) {
        child obj = new child();
        obj.show();
    }
}
