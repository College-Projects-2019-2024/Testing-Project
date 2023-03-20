import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.Test;


public class InputTesting{
    static Subject s;

    @BeforeAll
    static void init(){
        s = new Subject();
        s.readFile("C:\\Users\\Administrator\\JavaCode\\Testing-Project\\Test\\src\\Sample.txt");
    }

    @Test
    //check 
    void test1(){
        String expected = "";
        String actual = "";
        for(int i = 0; i<s.students.size(); i++){
            String str;
            str = s.students.get(i).checkStudentName();
            if(str!= ""){
                actual+="Student " + (i+1) + ": ";
                actual+=str;
                actual+=", ";
            }
        }
        assertEquals(actual, expected, actual);
        
        
    }


}