package Day05_Task;

class animal {
    void sound() {
        System.out.println("Sound of animal");
    }
}

class dog extends animal {
    @Override 
    void sound() {
        System.out.println("Dog barks");
    }
}

class cat extends animal {
    @Override 
    void sound() {
        System.out.println("Cat meaw");
    }
}

public class test9 {
    public static void main(String[] args) {
        dog obj1;
        obj1 = new dog();
        obj1.sound();

        cat obj2;
        obj2 = new cat();
        obj2.sound();

    }
}
