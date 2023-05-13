package TestCases.UnitTests;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import Main.Subject;

public class SubjectDegreeTest {
    // correct max degree
    @Test
    void test1() {
        String expected = "";
        String actual = Subject.checkMaxDegree(100);

        assertEquals(actual, expected, actual);
    }

    //incorrect max degree
    @Test
    void test2() {
        String expected = Subject.ERROR_MAX_DEGREE;
        String actual = Subject.checkMaxDegree(200);
        assertEquals(actual, expected, actual);
    }
}
