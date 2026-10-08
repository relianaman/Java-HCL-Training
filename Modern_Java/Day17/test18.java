
sealed class Machine permits Car, Bike {
    void display() {
        System.out.println("It's a machine");
    }
}

final class Car extends Machine {
    void get() {
        System.out.println("I'm a car");
    }
}

non-sealed class Bike extends Machine {
    void set() {
        System.out.println("I'm a bike");
    }
}

class Bicycle extends Bike {
    void show() {
        System.out.println("I'm a bicycle");
    }
}

public class test18 {
    public static void main(String[] args) {
        Car obj1 = new Car();
        obj1.display();
        obj1.get();

        Bike obj2 = new Bike();
        obj2.display();
        obj2.set();

        Bicycle obj3 = new Bicycle();
        obj3.display();
        obj3.show();

    }
}
