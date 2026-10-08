package Day04_Task;

public class test5 {

    void m1() {
        m2(this);
        System.out.println("1st method");
    } 

    void m2(test5 s) { 
        System.out.println("2nd method " + s);
    }

    public static void main(String[] args) {
        test5 obj = new test5();
        obj.m1();
    }
}
