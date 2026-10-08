package Day04_Task;

class person {
    public int age;

    public void display() {
        age = 10;
        System.out.println("The age is: " + age);
    }
}

public class test13 {
    public static void main(String[] args) {
        person obj = new person();
        obj.display();
    }
}
