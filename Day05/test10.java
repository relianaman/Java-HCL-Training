interface Animal {
    public void sound();
    public void eat();
}

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats fish");
    }
}

public class test10 {
    public static void main(String[] args) {
        Cat obj = new Cat();
        obj.sound();
        obj.eat();
    }
}
