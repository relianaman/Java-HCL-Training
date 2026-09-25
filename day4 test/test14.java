class person {
    private int age;

    public void setter() {
        age = 22;
    }

    public void getter() {
        System.out.println("The age is: " + age);
    }
}

public class test14 {
    public static void main(String[] args) {
        person obj = new person();
        obj.setter();
        obj.getter();
    }
}
