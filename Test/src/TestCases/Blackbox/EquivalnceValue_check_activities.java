package TestCases.Blackbox;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import Main.Student;

public class EquivalnceValue_check_activities {
    
    @Test
    void test1(){
        String actual = Student.check_activities(-2);
        String expected = Student.ERROR_ACTIVITES_MARK;
        assertEquals(actual,expected,actual);        
    }

    @Test
    void test2(){
        String actual = Student.check_activities(4);
        String expected = "";
        assertEquals(actual,expected,actual);        
    }

    @Test
    void test3(){
        String actual = Student.check_activities(13);
        String expected = Student.ERROR_ACTIVITES_MARK;
        assertEquals(actual,expected,actual);        
    }
}
