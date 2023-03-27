package TestCases;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import Main.Student;
import Main.Subject;


public class StudentNumberTest{
    static Subject s;

    
    final String STUDENT_NUMBER_CONTAIN = "Error: student number must be all digits until the last character.\n";
    final String STUDENT_NUMBER_END = "Error: student number must end with an alphabet/digit.\n";
    final String STUDENT_NUMBER_INVALID_LENGTH = "Error: student number length must be 8 characters.\n";
    
    

    //each test case will be on the first student just for illustration

    //all the tests outputs the exact error with exact number of student which has the error




    @Test
    //if student number is not of length 8
    void test1(){
        String expected = STUDENT_NUMBER_INVALID_LENGTH ;
        String actual = Student.checkStudentNumber("1234567");
        
        assertEquals(actual, expected, actual);
        
        
    }

    @Test
    //if student number contains a letter and its not the last character
    void test2(){
        String expected =  STUDENT_NUMBER_CONTAIN ;
        String actual = Student.checkStudentNumber("12h64567");
        
        assertEquals(actual, expected, actual);
        
        
    }

    @Test
    //if student number ends with something other than a digit or a letter
    void test3(){
        String expected = STUDENT_NUMBER_END ;
        String actual = Student.checkStudentNumber("1236456/");
        
        assertEquals(actual, expected, actual);
        
        
    }

    //correct number
    void test4(){
        String expected = STUDENT_NUMBER_END ;
        String actual = Student.checkStudentNumber("12345678");
        
        assertEquals(actual, expected, actual);
        
        
    }


}