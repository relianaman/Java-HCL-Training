class animal { //parent class    
    void display() {
        System.out.println("I am super class");
    }
}

class dog extends animal {
    void display1() {
        System.out.println("The dog barks");
    }
}

public class test7 {
    public static void main(String[] args) {
        dog obj = new dog();
        obj.display1();
        obj.display();
    }
}
