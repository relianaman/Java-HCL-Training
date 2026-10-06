//it is used to pass the current class instance as a parameter to the method
public class test5 {

    void m1() {
        m2(this);
        System.out.println("1st method");
    } 

    void m2(test5 s) { // reference of the the parameter is also printed
        System.out.println("2nd method " + s);
    }

    void m3() {
        m4(this);
        System.out.println("3rd method");
    } 

    void m4(test5 a) { 
        System.out.println("4th method");
    }

    public static void main(String[] args) {
        test5 obj = new test5();
        obj.m1();
        obj.m3();
    }
}
