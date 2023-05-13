package TestCases.UnitTests;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import Main.Student;


public class StudentNameTest{
    
    
    @Test
    //if name starts with space 
    void test1(){
        String expected = Student.STUDENT_NAME_SPACE;
        String actual = Student.checkStudentName(" samir");
        assertEquals(actual, expected, actual);
        
    }

    @Test
    //if name has numbers
    void test2(){
        String expected = Student.STUDENT_NAME_INVALID;
        String actual = Student.checkStudentName("sam6ir");
        assertEquals(actual, expected, actual);
    }

    @Test
    //if name is empty
    void test3(){
        String expected = Student.STRING_EMPTY;
        String actual = Student.checkStudentName("");
        
        assertEquals(actual, expected, actual);
        
        
    }

    //correct name
    void test4(){
        String expected = "";
        String actual = Student.checkStudentName("samir");
        
        assertEquals(actual, expected, actual);
        
        
    }


}