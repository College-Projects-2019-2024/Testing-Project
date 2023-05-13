package TestCases.IntegrationTest;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import Main.Student;

public class CheckStudent {
    final String STUDENT_NUMBER_CONTAIN = "Error: student number must be all digits until the last character.\n";
    final String STUDENT_NUMBER_END = "Error: student number must end with an alphabet/digit.\n";
    final String STUDENT_NUMBER_INVALID_LENGTH = "Error: student number length must be 8 characters.\n";
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
        String expected = STUDENT_NUMBER_CONTAIN;
        String actual = st.checkStudent();

        assertEquals(actual, expected, actual);
    }
}
