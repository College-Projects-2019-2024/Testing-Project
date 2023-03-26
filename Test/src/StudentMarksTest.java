import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.Test;


public class StudentMarksTest{
    static Subject s;

    final String ERROR_ACTIVITES_MARK = "Error: activites mark must be an integer from 1 to 10 of the full mark.";
    final String ERROR_MIDTERM_MARK = "Error: midterm mark must be an integer from 1 to 20 of the full mark.";
    final String ERROR_ORAL_MARK = "Error: Oral/Practical mark must be an integer from 1 to 10 of the full mark.";
    final String ERROR_FINAL_MARK = "Error: final exam mark must be an integer from 1 to 60 from the full mark.";

    
    @BeforeAll
    static void init(){
        s = new Subject();
        s.readFile("D:\\senior 1 comp\\testing\\Project\\Testing-Project\\Test\\src\\Sample.txt");
    }

    //each test case will be on the first student just for illustration

    //all the tests outputs the exact error with exact number of student which has the error




    @Test
    //if activities mark is more than 10
    void test1(){
        String expected = "Student 1: " + ERROR_ACTIVITES_MARK;
        String actual = "";
        for(int i = 0; i<s.students.size(); i++){
            String str;
            str = s.students.get(i).check_activities();
            if(str!= ""){
                actual+="Student " + (i+1) + ": ";
                actual+=str;
                
            }
        }
        assertEquals(actual, expected, actual);
        
        
    }

    @Test
    //if Oral mark is more than 10
    void test2(){
        String expected = "Student 1: " + ERROR_ORAL_MARK ;
        String actual = "";
        for(int i = 0; i<s.students.size(); i++){
            String str;
            str = s.students.get(i).check_oral();
            if(str!= ""){
                actual+="Student " + (i+1) + ": ";
                actual+=str;
                
            }
        }
        assertEquals(actual, expected, actual);
        
        
    }

    @Test
    //if midterm mark is more than 20
    void test3(){
        String expected = "Student 1: " + ERROR_MIDTERM_MARK ;
        String actual = "";
        for(int i = 0; i<s.students.size(); i++){
            String str;
            str = s.students.get(i).check_midterm();
            if(str!= ""){
                actual+="Student " + (i+1) + ": ";
                actual+=str;
                
            }
        }
        assertEquals(actual, expected, actual);
        
        
    }

    @Test
    //if final mark is more than 60
    void test4(){
        String expected = "Student 1: " + ERROR_FINAL_MARK ;
        String actual = "";
        for(int i = 0; i<s.students.size(); i++){
            String str;
            str = s.students.get(i).check_final();
            if(str!= ""){
                actual+="Student " + (i+1) + ": ";
                actual+=str;
                
            }
        }
        assertEquals(actual, expected, actual);
        
        
    }



}