package TestCases.IntegrationTest;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import Main.Subject;
import Main.fileIO;

import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ReadFileTest {
    private ByteArrayOutputStream out;
    Subject sub;
    
    @BeforeEach
    void Init() {
        out = new ByteArrayOutputStream();
        PrintStream print = new PrintStream(out);
        System.setOut(print);
        sub = new Subject("Dummy", "Dummy", 100);
    }

    //if the file was not open
    @Test
    public void test1(){
        String filename = "Test\\wrongfilename.txt";
        sub = fileIO.readFile(filename);

        String expected = "Invalid file name, file was not open\nFile is empty";
        String actual = out.toString();

        assertEquals(actual, expected, actual);

    }

    //the file is read and Subject data placed correctly
    @Test
    public void test2(){

        String filename = "D:\\senior 1 comp\\testing\\Project\\Testing-Project\\Test\\src\\TestFiles\\Integration\\testFile2.txt";
        sub = fileIO.readFile(filename);

        assertEquals("Error in test 2", "software testing",sub.getName());
        assertEquals("Error in test 2", "CSE333",sub.getCode());
        assertEquals("Error in test 2", 100,sub.getFullMark());

    }

    //the file is read and there was an error in a student
    //the student is not added to the list of students of the subject
    @Test
    public void test3(){

        String filename = "D:\\senior 1 comp\\testing\\Project\\Testing-Project\\Test\\src\\TestFiles\\Integration\\testFile3.txt";
        sub = fileIO.readFile(filename);

        int expected = 0;
        int actual = sub.getStudents().size();

        assertEquals("Error in test 3", expected,actual);
        
    
    }

    //if subject data was not in the first line
    @Test
    public void test4(){

        String filename = "D:\\senior 1 comp\\testing\\Project\\Testing-Project\\Test\\src\\TestFiles\\Integration\\testFile4.txt";
        sub = fileIO.readFile(filename);

        String expected = "No subject data\nSubject data must be in first line";
        String actual = out.toString();

        assertEquals("Error in test 4", expected,actual);
        
    }

    //Empty file
    @Test
    public void test5(){

        String filename = "D:\\senior 1 comp\\testing\\Project\\Testing-Project\\Test\\src\\TestFiles\\Integration\\testFile5.txt";
        sub = fileIO.readFile(filename);

        String expected = "File is empty";
        String actual = out.toString();

        assertEquals("Error in test 5", expected,actual);
        
    }

    //All file data is correct
    @Test
    public void test6(){

        String filename = "D:\\senior 1 comp\\testing\\Project\\Testing-Project\\Test\\src\\TestFiles\\Integration\\testFile6.txt";
        sub = fileIO.readFile(filename);

        

        assertEquals("Error in test 2", "Software testing",sub.getName());
        assertEquals("Error in test 2", "CSE333",sub.getCode());
        assertEquals("Error in test 2", 100,sub.getFullMark());

        int expected = 3;
        int actual = sub.getStudents().size();
        assertEquals("Error in test 6", expected,actual);
        
    }
}
