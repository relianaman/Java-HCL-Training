package marksheet;

public final class Semester3 extends Marksheet {

    public Semester3(Student student) {
        super(student);
    }

    @Override
    public void display() {

        System.out.println("""
                
                =================================================================================================
                                                         GRADE CARD
                                            School of Engineering and Technology
                                                    Bachelor of Technology
                                                        THIRD SEMESTER
                =================================================================================================
                NAME          : %s
                REG. NO.      : %s
                FATHER'S NAME : %s
                -------------------------------------------------------------------------------------------------
                SUBJECT CODE       SUBJECT TITLE                                      CREDIT       GRADE
                -------------------------------------------------------------------------------------------------
                BCO002B            Data Structures and Algorithms                       4            A
                BCO005B            Data Structure and Algorithms Lab                    1            A
                BCO008B            Operating Systems                                    3            B
                BCO009A            Computer Organization and Design                     3            A
                BCO011A            Computer Networks                                    4            O
                BCO014B            Operating Systems Lab                                1            O
                BCO232A            Software Engineering and Project Management          3            A
                DIN003A            Value Education 1                                    1            O
                DMA011C            Life Skills-II (Aptitude)                            2            A+
                -------------------------------------------------------------------------------------------------
                TOTAL                                                                   22
                -------------------------------------------------------------------------------------------------
                SGPA : 9.18                         CREDITS EARNED : 22
                =================================================================================================
                """.formatted(
                student.getName(),
                student.getRegistrationNumber(),
                student.getFatherName()
        ));
    }
}