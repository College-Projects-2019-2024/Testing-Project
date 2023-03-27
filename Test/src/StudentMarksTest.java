import static org.junit.Assert.assertEquals;



import org.junit.jupiter.api.Test;


public class StudentMarksTest{
    
    @Test
    //if activities mark is more than 10
    void test1(){
        String actual = Student.check_activities(11);
        String expected = Student.ERROR_ACTIVITES_MARK;
        assertEquals(actual, expected,actual);        
    }

    @Test
    //if Oral mark is more than 10
    void test2(){
        String expected = Student.ERROR_ORAL_MARK;
        String actual = Student.check_oral(11);
        assertEquals(actual, expected, actual);        
    }

    @Test
    //if midterm mark is more than 20
    void test3(){
       String expected = Student.ERROR_MIDTERM_MARK;
        String actual = Student.check_midterm(25);
        assertEquals(actual, expected, actual);
    }

    @Test
    //if final mark is more than 60
    void test4(){
        
        String expected = Student.ERROR_FINAL_MARK;
        String actual = Student.check_final(66);
        assertEquals(actual, expected, actual);
    }
    
    @Test
    //negative activities mark
    void test5(){
        String actual = Student.check_activities(-1);
        String expected = Student.ERROR_ACTIVITES_MARK;
        assertEquals(actual, expected,actual);     
    }

    @Test
    //correct activities mark
    void test6(){
        String actual = Student.check_activities(8);
        String expected = "";
        assertEquals(actual, expected,actual);      
    }

    @Test
    //correct oral mark
    void test7(){
        String expected = "";
        String actual = Student.check_oral(10);
        assertEquals(actual, expected, actual);
        
        
    }

    @Test
    //correct midterm mark
    void test8(){
       String expected = "";
        String actual = Student.check_midterm(18);
        assertEquals(actual, expected, actual);
        
    }


    @Test
    //correct final mark
    void test9(){
        
        String expected = "";
        String actual = Student.check_final(59);
        assertEquals(actual, expected, actual);
       
    }
    
    @Test
    //negative oral mark
    void test10(){
        String expected = Student.ERROR_ORAL_MARK;
        String actual = Student.check_oral(-2);
        assertEquals(actual, expected, actual);
    }
    //negative final mark
    @Test
    void test11()
    {
        String expected = Student.ERROR_FINAL_MARK;
        String actual = Student.check_final(-1);
        assertEquals(actual, expected, actual);
    }

    //negative midterm mark
    @Test
    void test12()
    {
        String expected = Student.ERROR_MIDTERM_MARK;
        String actual = Student.check_midterm(-1);
        assertEquals(actual, expected, actual);
    }
   





}