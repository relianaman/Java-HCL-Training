package marksheet;

public final class Semester4 extends Marksheet {

    public Semester4(Student student) {
        super(student);
    }

    @Override
    public void display() {

        System.out.println("""
                
                =================================================================================================
                                                         GRADE CARD
                                            School of Engineering and Technology
                                                    Bachelor of Technology
                                                        FORTH SEMESTER
                =================================================================================================
                NAME          : %s
                REG. NO.      : %s
                FATHER'S NAME : %s
                -------------------------------------------------------------------------------------------------
                SUBJECT CODE       SUBJECT TITLE                                      CREDIT       GRADE
                -------------------------------------------------------------------------------------------------
                BAS007B            Discrete Mathematics                                  3            A
                BCO010B            Database Management Systems                           4            A
                BCO013B            Database Management System Lab                        1            A+
                BCO081B            Programming with Python                               3            A
                BCO082B            Programming with Python Lab                           1            A
                BCO094B            Google Cloud Computing Foundation Program             3            A+
                DEN003A            Life Skills 1(Personality Development)                2            D
                DIN004A            Value Education 2                                     1            A+
                DPO006A            Social and Political Thought of Mahatma Gandhi        3            B
                -------------------------------------------------------------------------------------------------
                TOTAL                                                                       21
                -------------------------------------------------------------------------------------------------
                SGPA : 8.69                         CREDITS EARNED : 21
                =================================================================================================
                """.formatted(
                student.getName(),
                student.getRegistrationNumber(),
                student.getFatherName()
        ));
    }
}