package TestCases.IntegrationTest;
import static org.junit.Assert.assertEquals;

import Main.Subject;
import org.junit.jupiter.api.Test;


public class CheckSubjectData {
    //check that the name is correct
    @Test
    void test1() {

        String expected = "";
        String actual = Subject.checkSubjectData("Networks","CSE333",100);
        assertEquals(actual,expected, actual);
    }
// check that an error occurs when subject code is wrong
    @Test
    void test2() {

        String expected = Subject.SUBJECT_CODE_INVALID_LENGTH;
        String actual = Subject.checkSubjectData("FAKESUB","CSE33",100);
        assertEquals(actual,expected, actual);
    }

// check that an error occurs when subject name is incorrect
    @Test
    void test3() {

        String expected = Subject.SUBJECT_NAME_SPACE;
        String actual = Subject.checkSubjectData(" BAD","CSE333",100);
        assertEquals(actual,expected, actual);
    }







}
