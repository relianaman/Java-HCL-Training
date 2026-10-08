package Day06_Task;

class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
    
}

public class test16 {

    void ageCheck(int age) throws InvalidAgeException {
        if(age < 18) {
                throw new InvalidAgeException("Age must be above 18");
            }
            System.out.println("Eligible");
    }

    public static void main(String[] args) {
        test16 obj = new test16();
        try {
            obj.ageCheck(15);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
