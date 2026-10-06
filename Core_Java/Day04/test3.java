//This keyword for current class method

public class test3 {
    void m1() {
        System.out.println("M1 initialised");
        this.m2();  //calling m2 with help of this keyword
    }

    void m2() {
        System.out.println("M2 initialised");
    }

    public static void main(String[] args) {
        test3 obj = new test3();
        obj.m1();
    }
}
