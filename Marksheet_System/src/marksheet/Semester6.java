package marksheet;

public final class Semester6 extends Marksheet {

    public Semester6(Student student) {
        super(student);
    }

    @Override
    public void display() {

        System.out.println("""
                
                =================================================================================================
                                                         GRADE CARD
                                            School of Engineering and Technology
                                                    Bachelor of Technology
                                                        SIXTH SEMESTER
                =================================================================================================
                NAME          : %s
                REG. NO.      : %s
                FATHER'S NAME : %s
                -------------------------------------------------------------------------------------------------
                SUBJECT CODE       SUBJECT TITLE                                      CREDIT       GRADE
                -------------------------------------------------------------------------------------------------
                BCO019A            Artificial Intelligence                              3            A
                BCO028B            Compiler Construction                                4            B
                BCO031B            Compiler Design Lab                                  1            A+
                BCO037B            Advance Programming in Java                          3            A
                BCO069B            Advance Programming in Java Lab                      1            A+
                BCO074C            Minor Project                                        4            A
                NPTEL788A          Conservation Economics                               3            O
                -------------------------------------------------------------------------------------------------
                TOTAL                                                                   19
                -------------------------------------------------------------------------------------------------
                SGPA : 9.00                         CREDITS EARNED : 19
                =================================================================================================
                """.formatted(
                student.getName(),
                student.getRegistrationNumber(),
                student.getFatherName()
        ));
    }
}