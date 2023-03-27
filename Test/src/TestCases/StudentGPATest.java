package TestCases;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import Main.Student;


public class StudentGPATest{
    

   
    
    @Test
    
    void test1(){
        double expected = 4.0;
        double actual = Student.calculateGPA(100);
        assertEquals(actual, expected, actual);
        
    }

    @Test
    
    void test2(){
        double expected = 4.0;
        double actual = Student.calculateGPA(94);
        assertEquals(actual, expected, actual);
    }

    @Test
    
    void test3(){
        double expected = 3.7;
        double actual = Student.calculateGPA(91);
        assertEquals(actual, expected, actual);
        
    }

    @Test
    void test4(){
        double expected = 3.3;
        double actual = Student.calculateGPA(86);
        assertEquals(actual, expected, actual);
            
    }

    @Test
    void test5(){
        double expected = 3.0;
        double actual = Student.calculateGPA(81);
        assertEquals(actual, expected, actual);
        
    }

     @Test
    void test6(){
        double expected = 2.7;
        double actual = Student.calculateGPA(76);
        assertEquals(actual, expected, actual);
        
    }

     @Test
    void test7(){
        double expected = 2.3;
        double actual = Student.calculateGPA(74);
        assertEquals(actual, expected, actual);
        
    }

     @Test
    void test8(){
        double expected = 2.0;
        double actual = Student.calculateGPA(71);
        assertEquals(actual, expected, actual);
        
    }

     @Test
    void test9(){
        double expected = 1.7;
        double actual = Student.calculateGPA(69);
        assertEquals(actual, expected, actual);
        
    }

    @Test
    void test10(){
        double expected = 1.3;
        double actual = Student.calculateGPA(66);
        assertEquals(actual, expected, actual);
        
    }

    @Test
    void test11(){
        double expected = 1.0;
        double actual = Student.calculateGPA(60);
        assertEquals(actual, expected, actual);
        
    }

    @Test
    void test12(){
        double expected = 0;
        double actual = Student.calculateGPA(53);
        assertEquals(actual, expected, actual);
        
    }

    @Test
    void test13(){
        double expected = Student.ERROR_GPA;
        double actual = Student.calculateGPA(-26);
        assertEquals(actual, expected, actual);  
    }

}