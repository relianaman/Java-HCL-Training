package marksheet;

public final class Semester1 extends Marksheet {

    public Semester1(Student student) {
        super(student);
    }

    @Override
    public void display() {

        System.out.println("""
                
                =================================================================================================
                                                         GRADE CARD
                                            School of Engineering and Technology
                                                    Bachelor of Technology
                                                        FIRST SEMESTER
                =================================================================================================
                NAME          : %s
                REG. NO.      : %s
                FATHER'S NAME : %s
                -------------------------------------------------------------------------------------------------
                SUBJECT CODE       SUBJECT TITLE                                      CREDIT       GRADE
                -------------------------------------------------------------------------------------------------
                DCH002A            Engineering Chemistry                                3            A
                DCH003A            Engineering Chemistry Lab                            1            B
                DCO013A            Computer Programming and Logical Thinking            3            A+
                DCO014A            Computer Programming and Logical Thinking Lab        1            O
                DEN001A            Communication Skills                                 2            B
                DEN001B            Communication Skills Lab                             1            A
                DIN001A            Culture Education - 1                                2            A+
                DLW001A            Indian Constitution                                  0            B
                DMA001A            Engineering Mathematics-I                            4            O
                DME001A            Engineering Graphics-Auto Cad                        1            O
                JIC001A            Entrepreneurship Development-I                       1            C
                -------------------------------------------------------------------------------------------------
                TOTAL                                                                  19
                -------------------------------------------------------------------------------------------------
                SGPA : 9.18                         CREDITS EARNED : 19
                =================================================================================================
                """.formatted(
                student.getName(),
                student.getRegistrationNumber(),
                student.getFatherName()
        ));
    }
}