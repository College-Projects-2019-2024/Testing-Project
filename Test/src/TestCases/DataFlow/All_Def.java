package TestCases.DataFlow;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import Main.Subject;
import Main.fileIO;

public class All_Def {

    //each test case number corresponds to its number in the pdf
    @Test
    public void test1(){
        String filename = "D:\\senior 1 comp\\testing\\Project\\Testing-Project\\Test\\src\\TestFiles\\DataFlow\\testFile1.txt";
        Subject sub = fileIO.readFile(filename);

        assertEquals("Error in test 1", "software testing",sub.getName());
        assertEquals("Error in test 1", "CSE333",sub.getCode());
        assertEquals("Error in test 1", 100,sub.getFullMark());
    }
}
