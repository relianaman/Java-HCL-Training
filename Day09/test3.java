public class test3 {
    public static void main(String[] args) {
        Person person1 = new Person("Alice");
        Person person2 = new Person("Bob");
    }
}

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}