package TestCases.Whitebox;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import Main.Student;

public class branchCoverage {
    
   //each test case number corresponds to its number in the pdf
    @Test
    void test1(){
        double expected = 4.0;
        double actual = Student.calculateGPA(95);
        assertEquals(actual, expected, actual);
    }

    @Test
    void test2(){
        double expected = 3.7;
        double actual = Student.calculateGPA(90);
        assertEquals(actual, expected, actual);
        
    }

    @Test
    void test3(){
        double expected = 3.3;
        double actual = Student.calculateGPA(85);
        assertEquals(actual, expected, actual);
            
    }

    @Test
    void test4(){
        double expected = 3.0;
        double actual = Student.calculateGPA(82);
        assertEquals(actual, expected, actual);
        
    }

     @Test
    void test5(){
        double expected = 2.7;
        double actual = Student.calculateGPA(78);
        assertEquals(actual, expected, actual);
        
    }

     @Test
    void test6(){
        double expected = 2.3;
        double actual = Student.calculateGPA(73);
        assertEquals(actual, expected, actual);
        
    }

     @Test
    void test7(){
        double expected = 2.0;
        double actual = Student.calculateGPA(71);
        assertEquals(actual, expected, actual);
        
    }

     @Test
    void test8(){
        double expected = 1.7;
        double actual = Student.calculateGPA(68);
        assertEquals(actual, expected, actual);
        
    }

    @Test
    void test9(){
        double expected = 1.3;
        double actual = Student.calculateGPA(65);
        assertEquals(actual, expected, actual);
        
    }

    @Test
    void test10(){
        double expected = 1.0;
        double actual = Student.calculateGPA(60);
        assertEquals(actual, expected, actual);
        
    }

    @Test
    void test11(){
        double expected = 0;
        double actual = Student.calculateGPA(33);
        assertEquals(actual, expected, actual);
        
    }

    
    @Test
    void test12(){
        double expected = Student.ERROR_GPA;
        double actual = Student.calculateGPA(-3);
        assertEquals(actual, expected, actual);  
    }
}
