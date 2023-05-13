package TestCases.IntegrationTest;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import Main.Student;

public class CheckStudent {
    
    //correct student
    @Test
    void test1(){

        Student st = new Student("Mostafa,12345678,10,9,15,57");
        String expected = "";
        String actual = st.checkStudent();

        assertEquals(actual, expected, actual);
    }

    //wrong number
    @Test
    void test2(){

        Student st = new Student("Mostafa,123ty678,10,9,15,57");
        String expected = Student.STUDENT_NUMBER_CONTAIN;
        String actual = st.checkStudent();

        assertEquals(actual, expected, actual);
    }

    //wrong number and final mark
    @Test
    void test3(){

        Student st = new Student("Mostafa,123ty678,10,9,15,68");
        String expected = Student.STUDENT_NUMBER_CONTAIN + Student.ERROR_FINAL_MARK;
        String actual = st.checkStudent();

        assertEquals(actual, expected, actual);
    }

    //wrong marks
    @Test
    void test4(){

        Student st = new Student("Mostafa,12345678,14,16,30,68");
        String expected = Student.ERROR_ACTIVITES_MARK + Student.ERROR_FINAL_MARK +
                            Student.ERROR_ORAL_MARK+ Student.ERROR_MIDTERM_MARK;
        String actual = st.checkStudent();

        assertEquals(actual, expected, actual);
    }
}
