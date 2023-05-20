package TestCases.Whitebox;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import Main.Student;
public class statementCoverage {
    

    //each test case number corresponds to its number in the pdf

    
    @Test
    
    void test1(){
        String expected = Student.STRING_EMPTY;
        String actual = Student.checkStudentName("");
        assertEquals(actual, expected, actual);
        
    }

    @Test
    
    void test2(){
        String expected = Student.STUDENT_NAME_SPACE;
        String actual = Student.checkStudentName(" Mohamed");
        assertEquals(actual, expected, actual);
    }

    @Test
   
    void test3(){
        String expected = Student.STUDENT_NAME_INVALID;
        String actual = Student.checkStudentName("7ossam");
        
        assertEquals(actual, expected, actual);
        
        
    }

    @Test
    void test4(){
        String expected = "";
        String actual = Student.checkStudentName("Mark");
        
        assertEquals(actual, expected, actual);
        
        
    }
}
