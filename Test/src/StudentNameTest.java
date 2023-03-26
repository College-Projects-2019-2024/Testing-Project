import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.Test;


public class StudentNameTest{
    static Subject s;

    final String STRING_EMPTY = "Error: Student is empty.";
    final String STUDENT_NAME_SPACE = "Error: Student name starts with a space.";
    final String STUDENT_NAME_INVALID = "Error: Student name must consist of alphabetic characters and spaces.";
    

    @BeforeAll
    static void init(){
        s = new Subject();
        s.readFile("D:\\senior 1 comp\\testing\\Project\\Testing-Project\\Test\\src\\Sample.txt");
    }

    //each test case will be on the first student

    @Test
    //if name starts with space 
    void test1(){
        String expected = "Student 1: " + STUDENT_NAME_SPACE;
        String actual = "";
        for(int i = 0; i<s.students.size(); i++){
            String str;
            str = s.students.get(i).checkStudentName();
            if(str!= ""){
                actual+="Student " + (i+1) + ": ";
                actual+=str;
                
            }
        }
        assertEquals(actual, expected, actual);
        
        
    }

    @Test
    //if name has numbers
    void test2(){
        String expected = "Student 1: " + STUDENT_NAME_INVALID;
        String actual = "";
        for(int i = 0; i<s.students.size(); i++){
            String str;
            str = s.students.get(i).checkStudentName();
            if(str!= ""){
                actual+="Student " + (i+1) + ": ";
                actual+=str;
                
            }
        }
        assertEquals(actual, expected, actual);
        
        
    }

    @Test
    //if name is empty
    void test3(){
        String expected = "Student 1: " + STRING_EMPTY;
        String actual = "";
        for(int i = 0; i<s.students.size(); i++){
            String str;
            str = s.students.get(i).checkStudentName();
            if(str!= ""){
                actual+="Student " + (i+1) + ": ";
                actual+=str;
                
            }
        }
        assertEquals(actual, expected, actual);
        
        
    }


}