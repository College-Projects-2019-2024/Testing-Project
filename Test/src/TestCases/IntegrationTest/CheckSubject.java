package TestCases.IntegrationTest;
import static org.junit.Assert.assertEquals;

import Main.Subject;
import org.junit.jupiter.api.Test;
import Main.Student;

public class CheckSubject {

    @Test
    void test1() {

        String expected = "";
        String actual = Subject.checkSubject("Networks","CSE333",100);
        assertEquals(actual,expected, actual);
    }

    @Test
    void test2() {

        String expected = Subject.SUBJECT_CODE_INVALID_LENGTH;
        String actual = Subject.checkSubject("FAKESUB","CSE33",100);
        assertEquals(actual,expected, actual);
    }


    @Test
    void test3() {

        String expected = Subject.SUBJECT_NAME_SPACE;
        String actual = Subject.checkSubject(" BAD","CSE333",100);
        assertEquals(actual,expected, actual);
    }







}
