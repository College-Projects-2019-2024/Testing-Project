package TestCases.DataFlow;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import Main.Subject;
import Main.fileIO;

import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ADUP{
    private ByteArrayOutputStream out;

    @BeforeEach
    void Init() {
        out = new ByteArrayOutputStream();
        PrintStream print = new PrintStream(out);
        System.setOut(print);
        
        
    }

    //each test case number corresponds to its number in the pdf

    @Test
    public void test1(){
        String filename = "D:\\senior 1 comp\\testing\\Project\\Testing-Project\\Test\\src\\TestFiles\\DataFlow\\testFile1.txt";
        Subject sub = fileIO.readFile(filename);

        assertEquals("Error in test 1", "software testing",sub.getName());
        assertEquals("Error in test 1", "CSE333",sub.getCode());
        assertEquals("Error in test 1", 100,sub.getFullMark());
    }

    @Test
    public void test2(){
        String filename = "D:\\senior 1 comp\\testing\\Project\\Testing-Project\\Test\\src\\TestFiles\\DataFlow\\testFile2.txt";
        Subject sub = fileIO.readFile(filename);

        assertEquals("Error in test 2", null,sub);
        
    }

    @Test
    public void test3(){
        String filename = "D:\\senior 1 comp\\testing\\Project\\Testing-Project\\Test\\src\\TestFiles\\DataFlow\\testFile3.txt";
       fileIO.readFile(filename);

        String actual = out.toString();
        String expected = "File is empty";
        assertEquals("Error in test 3", expected,actual);
        
    }

    @Test
    public void test4(){
        String filename = "D:\\senior 1 comp\\testing\\Project\\Testing-Project\\Test\\src\\TestFiles\\DataFlow\\testFile4.txt";
        Subject sub = fileIO.readFile(filename);

        //error in student so length of student array of the subject is zero
        assertEquals("Error in test 4", 0,sub.getStudents().size());
        
    }

    @Test
    public void test5(){
        String filename = "D:\\senior 1 comp\\testing\\Project\\Testing-Project\\Test\\src\\TestFiles\\DataFlow\\testFile5.txt";
        fileIO.readFile(filename);

        String actual = out.toString();
        String expected = "No subject data\nSubject data must be in first line";
        assertEquals("Error in test 5", expected,actual);
        
    }


}
