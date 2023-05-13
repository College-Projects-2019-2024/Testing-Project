package TestCases.UnitTests;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import Main.Subject;

public class SubjectNameTest {
    @Test
    void test1() {
        String expected = Subject.SUBJECT_NAME_SPACE;
        String actual = Subject.checkSubjectName(" software");
        assertEquals(actual, expected, actual);
    }

    @Test
    // if name has numbers
    void test2() {
        String expected = Subject.SUBJECT_NAME_INVALID;
        String actual = Subject.checkSubjectName("softwa5e");
        assertEquals(actual, expected, actual);
    }

    @Test
    // if name is empty
    void test3() {
        String expected = Subject.STRING_EMPTY;
        String actual = Subject.checkSubjectName("");
        assertEquals(actual, expected, actual);
    }

    @Test
    // correct name
    void test4() {
        String expected = "";
        String actual = Subject.checkSubjectName("software");

        assertEquals(actual, expected, actual);
    }
}
