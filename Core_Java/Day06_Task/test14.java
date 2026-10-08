package Day06_Task;

public class test14 {

    void ageCheck(int age) throws Exception {
        if(age < 18) {
                throw new Exception("Age must be above 18");
            }
            System.out.println("Eligible");
    }

    public static void main(String[] args) {
        test14 obj = new test14();
        try {
            obj.ageCheck(15);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
