package TestCases.UnitTests;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import Main.Student;
import Main.Subject;


public class StudentNumberTest{
    static Subject s;

    @Test
    
    //if student number is not of length 8
    void test1(){
        String expected = Student.STUDENT_NUMBER_INVALID_LENGTH ;
        String actual = Student.checkStudentNumber("1234567");
        
        assertEquals(actual, expected, actual);
        
        
    }

    @Test
    //if student number contains a letter and its not the last character
    void test2(){
        String expected =  Student.STUDENT_NUMBER_CONTAIN ;
        String actual = Student.checkStudentNumber("12h64567");
        
        assertEquals(actual, expected, actual);
        
        
    }

    @Test
    //if student number ends with something other than a digit or a letter
    void test3(){
        String expected = Student.STUDENT_NUMBER_END ;
        String actual = Student.checkStudentNumber("1236456/");
        
        assertEquals(actual, expected, actual);
        
        
    }

    @Test
    //correct number
    void test4(){
        String expected = "" ;
        String actual = Student.checkStudentNumber("12345678");
        
        assertEquals(actual, expected, actual);
        
        
    }


}