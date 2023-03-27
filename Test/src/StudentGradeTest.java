import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;


public class StudentGradeTest{
    
    @Test
    void test1(){
        String expected = "A+";
        String actual = Student.calculateGrade(100);
        assertEquals(actual, expected, actual);
        
    }

    @Test
    
    void test2(){
        String expected = "A";
        String actual = Student.calculateGrade(94);
        assertEquals(actual, expected, actual);
    }

    @Test
    
    void test3(){
       String expected = "A-";
        String actual = Student.calculateGrade(91);
        assertEquals(actual, expected, actual);
        
    }

    @Test
    void test4(){
        String expected = "B+";
        String actual = Student.calculateGrade(86);
        assertEquals(actual, expected, actual);
            
    }

    @Test
    void test5(){
        String expected = "B";
        String actual = Student.calculateGrade(81);
        assertEquals(actual, expected, actual);
        
    }

     @Test
    void test6(){
        String expected = "B-";
        String actual = Student.calculateGrade(76);
        assertEquals(actual, expected, actual);
        
    }

     @Test
    void test7(){
        String expected = "C+";
        String actual = Student.calculateGrade(74);
        assertEquals(actual, expected, actual);
        
    }

     @Test
    void test8(){
       String expected = "C";
        String actual = Student.calculateGrade(71);
        assertEquals(actual, expected, actual);
        
    }

     @Test
    void test9(){
        String expected = "C-";
        String actual = Student.calculateGrade(69);
        assertEquals(actual, expected, actual);
        
    }

    @Test
    void test10(){
       String expected = "D+";
        String actual = Student.calculateGrade(66);
        assertEquals(actual, expected, actual);
        
    }

    @Test
    void test11(){
        String expected = "D";
        String actual = Student.calculateGrade(60);
        assertEquals(actual, expected, actual);
        
    }

    @Test
    void test12(){
        String expected = "F";
        String actual = Student.calculateGrade(55);
        assertEquals(actual, expected, actual);
        
    }

    @Test
    void test13(){
        String expected = Student.ERROR_SUM;
        String actual = Student.calculateGrade(-30);
        assertEquals(actual, expected, actual);  
    }

}