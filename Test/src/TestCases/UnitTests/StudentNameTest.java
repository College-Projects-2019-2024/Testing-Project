package TestCases.UnitTests;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import Main.Student;


public class StudentNameTest{
    

    final String STRING_EMPTY = "Error: Student is empty.\n";
    final String STUDENT_NAME_SPACE = "Error: Student name starts with a space.\n";
    final String STUDENT_NAME_INVALID = "Error: Student name must consist of alphabetic characters and spaces.\n";
    
    @Test
    //if name starts with space 
    void test1(){
        String expected = STUDENT_NAME_SPACE;
        String actual = Student.checkStudentName(" samir");
        assertEquals(actual, expected, actual);
        
    }

    @Test
    //if name has numbers
    void test2(){
        String expected = STUDENT_NAME_INVALID;
        String actual = Student.checkStudentName("sam6ir");
        assertEquals(actual, expected, actual);
    }

    @Test
    //if name is empty
    void test3(){
        String expected = STRING_EMPTY;
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