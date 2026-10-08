package Day05;

class Animal {
    Animal() {
        System.out.println("Animal");
    }
}

class Mammal extends Animal {
    Mammal() {
        System.out.println("Mammal");
    }
}

class Dog extends Mammal {
    Dog() {
        System.out.println("Dog");
    }
}

public class test5 {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Dog obj = new Dog();
    }
}
