package marksheet;

public final class Semester5 extends Marksheet {

    public Semester5(Student student) {
        super(student);
    }

    @Override
    public void display() {

        System.out.println("""
                
                =================================================================================================
                                                         GRADE CARD
                                            School of Engineering and Technology
                                                    Bachelor of Technology
                                                        FIFTH SEMESTER
                =================================================================================================
                NAME          : %s
                REG. NO.      : %s
                FATHER'S NAME : %s
                -------------------------------------------------------------------------------------------------
                SUBJECT CODE       SUBJECT TITLE                                      CREDIT       GRADE
                -------------------------------------------------------------------------------------------------
                BCO007A            Computer Graphics                                    3            A+
                BCO015B            Computer Graphics Lab                                1            A
                BCO017A            Formal Languages and Automation Theory               4            A
                BCO023A            Design and Analysis of Algorithms                    4            B
                BCO025B            Design and Analysis of Algorithms Lab                1            D
                BCO035B            Programming in Java                                  3            A
                BCO068B            Programming in Java Lab                              1            A
                BCO406A            Google Cloud Career Readiness Program                3            A
                NPTEL625A          Wild Life Ecology                                    3            O
                -------------------------------------------------------------------------------------------------
                TOTAL                                                                   23
                -------------------------------------------------------------------------------------------------
                SGPA : 8.89                         CREDITS EARNED : 23
                =================================================================================================
                """.formatted(
                student.getName(),
                student.getRegistrationNumber(),
                student.getFatherName()
        ));
    }
}