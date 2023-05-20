package TestCases.Blackbox;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import Main.Student;

public class EquivalenceClass_check_final {
    
    @Test
    void test1(){
        
        String expected = Student.ERROR_FINAL_MARK;
        String actual = Student.check_final(-2);
        assertEquals(actual, expected, actual);
    }

    @Test
    void test2(){
        
        String expected = "";
        String actual = Student.check_final(25);
        assertEquals(actual, expected, actual);
    }

    @Test
    void test3(){
        
        String expected = Student.ERROR_FINAL_MARK;
        String actual = Student.check_final(70);
        assertEquals(actual, expected, actual);
    }
}
