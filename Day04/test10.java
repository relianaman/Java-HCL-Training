class person {
    private String name; //private

    @SuppressWarnings("unused")
    int age; //default

    public void display(String name) { //public
        this.name = name;
        System.out.println(this.name);
    }
}


public class test10 {
    public static void main(String[] args) {
        person obj = new person();
        obj.display("Naman");
        System.out.println(obj.age = 22);

    }
}
