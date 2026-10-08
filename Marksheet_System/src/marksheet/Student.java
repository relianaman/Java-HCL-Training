package marksheet;

public class Student {

    private String name;
    private String registrationNumber;
    private String fatherName;

    public Student(String name, String registrationNumber, String fatherName) {
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.fatherName = fatherName;
    }

    public String getName() {
        return name;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getFatherName() {
        return fatherName;
    }
}