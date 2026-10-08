package Day08;

interface Printable {
    void print();
}

class Person {
    void display() {
        System.out.println("Person");
    }
}

class Demo<D extends Person & Printable> {
    D obj;

    Demo(D obj) {
        this.obj = obj;
    }

    void show() {
        obj.display();
        obj.print();
    }
}

class Student extends Person implements Printable {
    @Override
    public void print() {
        System.out.println("Student Print");
    }
}

public class test12 {
    Demo<Student> obj = new Demo<>(new Student());
    obj.show();
}
