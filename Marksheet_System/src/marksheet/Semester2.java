package marksheet;

public final class Semester2 extends Marksheet {

    public Semester2(Student student) {
        super(student);
    }

    @Override
    public void display() {

        System.out.println("""
                
                =================================================================================================
                                                         GRADE CARD
                                            School of Engineering and Technology
                                                    Bachelor of Technology
                                                        SECOND SEMESTER
                =================================================================================================
                NAME          : %s
                REG. NO.      : %s
                FATHER'S NAME : %s
                -------------------------------------------------------------------------------------------------
                SUBJECT CODE       SUBJECT TITLE                                      CREDIT       GRADE
                -------------------------------------------------------------------------------------------------
                DCH004A            Enviornmental Sciences                                0            C
                DCO001A            Computer Programming in C++                           3            A
                DCO002A            Computer Programming in C++Lab                        1            A+
                DCO006A            Engineering Workshop CSE                              2            B
                DEE003A            Basic Electrical and Electronics Engineering          3            B
                DEN002A            Professional Skills                                   2            B
                DEN002B            Professional Skills Lab                               1            A
                DIN002A            Culture Education 2                                   2            A+
                DMA002A            Engineering Mathematics-II                            4            O
                DPH001A            Applied Physics                                       3            C
                DPH002A            Applied Physics Lab                                   1            B
                JIC002A            Entrepreneurship Development-II                       1            B
                -------------------------------------------------------------------------------------------------
                TOTAL                                                                    23
                -------------------------------------------------------------------------------------------------
                SGPA : 8.59                         CREDITS EARNED : 23
                =================================================================================================
                """.formatted(
                student.getName(),
                student.getRegistrationNumber(),
                student.getFatherName()
        ));
    }
}