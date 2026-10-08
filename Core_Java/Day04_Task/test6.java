package Day04_Task;

public class test6 {
    String name;

    test6(String name) {
        this.name = name;
    }

    void display(test6 obj) {
        System.out.println("The name is: " + obj.name);
    }

    void show() {
        display(this);
    }

    public static void main(String[] args) {
        test6 obj = new test6("Naman");
        obj.show();
    }
}