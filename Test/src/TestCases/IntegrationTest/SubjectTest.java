package TestCases.IntegrationTest;
import Main.Subject;
import org.junit.jupiter.api.Test;


import static org.junit.Assert.assertEquals;

public class SubjectTest {

    //check that data is inserted correctly
    @Test
    void test1() {

        String testName = "CSESubject";
        String testCode = "CSE123";
        int maxTest = 100;
        Subject subject = new Subject(testName,testCode,maxTest);
        assertEquals(subject.getName(),testName, subject.getName());
        assertEquals(subject.getCode(),testCode, subject.getCode());
        assertEquals(subject.getFullMark(),maxTest, subject.getFullMark());
    }


// check for the subject data for correctness
    @Test
    void test2() {

        String testName = "Graphs";
        String testCode = "CSE666";
        int maxTest = 100;

        Subject subject = new Subject(testName,testCode,maxTest);
        assertEquals(subject.checkSubjectData(),"",subject.checkSubjectData());
        
    }





}
