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

public class test10 {
    public static void main(String[] args) {
        animal obj1;
        obj1 = new dog();
        obj1.sound();

        animal obj2;
        obj2 = new cat();
        obj2.sound();

    }
}
