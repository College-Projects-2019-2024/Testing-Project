package TestCases;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import Main.Subject;

public class SubjectTest {
    @Test
    void test1(){
        String expected = Subject.SUBJECT_NAME_SPACE;
        String actual = Subject.checkSubjectName(" samir");
        assertEquals(actual, expected, actual);
    }

    @Test
    //if name has numbers
    void test2(){
        String expected = Subject.SUBJECT_NAME_INVALID;
        String actual = Subject.checkSubjectName("sam6ir");
        assertEquals(actual, expected, actual);
    }

    @Test
    //if name is empty
    void test3(){
        String expected = Subject.STRING_EMPTY;
        String actual = Subject.checkSubjectName("");
        assertEquals(actual, expected, actual);
    }
    @Test
    //correct name
    void test4(){
        String expected = "";
        String actual = Subject.checkSubjectName("samir");
        
        assertEquals(actual, expected, actual);  
    }
      //correct degree
      @Test
      void test5()
      {
        String expected = "";
        String actual = Subject.checkMaxDegree(100);
        
        assertEquals(actual, expected, actual);  
    }
    @Test
    void test6()
    {
      String expected = Subject.ERROR_MAX_DEGREE;
      String actual = Subject.checkMaxDegree(200);
      assertEquals(actual, expected, actual);  
  }
    //max degree != 100



    
    
}
