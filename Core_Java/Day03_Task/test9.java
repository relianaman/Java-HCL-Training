public class test9 {
    String company;
    int model;
    int price;

    void display() {
        System.out.println("Company: " + company);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        test9 obj = new test9();
        obj.company = "Audi";
        obj.model = 2025;
        obj.price = 250000;
        obj.display();
    }
}
