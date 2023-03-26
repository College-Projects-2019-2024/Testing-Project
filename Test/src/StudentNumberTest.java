import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.Test;


public class StudentNumberTest{
    static Subject s;

    
    final String STUDENT_NUMBER_CONTAIN = "Error: student number must be all digits until the last character.";
    final String STUDENT_NUMBER_END = "Error: student number must end with an alphabet/digit.";
    final String STUDENT_NUMBER_INVALID_LENGTH = "Error: student number length must be 8 characters.";
    
    @BeforeAll
    static void init(){
        s = new Subject();
        s.readFile("D:\\senior 1 comp\\testing\\Project\\Testing-Project\\Test\\src\\Sample.txt");
    }

    //each test case will be on the first student just for illustration

    //all the tests outputs the exact error with exact number of student which has the error




    @Test
    //if student number is not of length 8
    void test1(){
        String expected = "Student 1: " + STUDENT_NUMBER_INVALID_LENGTH ;
        String actual = "";
        for(int i = 0; i<s.students.size(); i++){
            String str;
            str = s.students.get(i).checkStudentNumber();
            if(str!= ""){
                actual+="Student " + (i+1) + ": ";
                actual+=str;
                
            }
        }
        assertEquals(actual, expected, actual);
        
        
    }

    @Test
    //if student number contains a letter and its not the last character
    void test2(){
        String expected = "Student 1: " + STUDENT_NUMBER_CONTAIN ;
        String actual = "";
        for(int i = 0; i<s.students.size(); i++){
            String str;
            str = s.students.get(i).checkStudentNumber();
            if(str!= ""){
                actual+="Student " + (i+1) + ": ";
                actual+=str;
                
            }
        }
        assertEquals(actual, expected, actual);
        
        
    }

    @Test
    //if student number ends with something other than a digit or a letter
    void test3(){
        String expected = "Student 1: " + STUDENT_NUMBER_END ;
        String actual = "";
        for(int i = 0; i<s.students.size(); i++){
            String str;
            str = s.students.get(i).checkStudentNumber();
            if(str!= ""){
                actual+="Student " + (i+1) + ": ";
                actual+=str;
                
            }
        }
        assertEquals(actual, expected, actual);
        
        
    }


}