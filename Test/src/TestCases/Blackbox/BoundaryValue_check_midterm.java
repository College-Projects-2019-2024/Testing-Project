package TestCases.Blackbox;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import Main.Student;

public class BoundaryValue_check_midterm {
    @Test
    void test1(){
        String expected = Student.ERROR_MIDTERM_MARK;
         String actual = Student.check_midterm(-1);
         assertEquals(actual, expected, actual);
     }

     @Test
    void test2(){
        String expected = "";
         String actual = Student.check_midterm(0);
         assertEquals(actual, expected, actual);
     }

     @Test
    void test3(){
        String expected = "";
         String actual = Student.check_midterm(0);
         assertEquals(actual, expected, actual);
     }

     @Test
    void test4(){
        String expected = "";
         String actual = Student.check_midterm(0);
         assertEquals(actual, expected, actual);
     }

     @Test
    void test5(){
        String expected = "";
         String actual = Student.check_midterm(0);
         assertEquals(actual, expected, actual);
     }

     @Test
    void test6(){
        String expected = "";
         String actual = Student.check_midterm(0);
         assertEquals(actual, expected, actual);
     }


     @Test
     void test7(){
         String expected = Student.ERROR_MIDTERM_MARK;
          String actual = Student.check_midterm(21);
          assertEquals(actual, expected, actual);
      }


}
