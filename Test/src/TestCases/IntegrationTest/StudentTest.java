package TestCases.IntegrationTest;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import Main.Student;

public class StudentTest {
    @Test
    public void test1(){
        Student st = new Student("Mohamed,12345678,10,10,19,59");

        assertEquals("Error", "Mohamed", st.getName());
        assertEquals("Error", "12345678", st.getStudentNumber());
        assertEquals("Error", 10, st.getActivitiesMark());
        assertEquals("Error", 10, st.getOral_practicalMark());
        assertEquals("Error", 19, st.getMidtermMark());
        assertEquals("Error", 59, st.getFinalMark());
        assertEquals("Error", 98, st.getSum());

    }

    @Test
    public void test2(){
        Student st = new Student("Mohamed,12345678,10,10,19,59");
        String actual = st.checkStudentData();
        String expected = "";
        
        assertEquals(actual, expected, actual);

    }
    
}
