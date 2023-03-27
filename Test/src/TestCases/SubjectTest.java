package TestCases;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import Main.Subject;

public class SubjectTest {
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

    // correct max degree
    @Test
    void test5() {
        String expected = "";
        String actual = Subject.checkMaxDegree(100);

        assertEquals(actual, expected, actual);
    }

    //incorrect max degree
    @Test
    void test6() {
        String expected = Subject.ERROR_MAX_DEGREE;
        String actual = Subject.checkMaxDegree(200);
        assertEquals(actual, expected, actual);
    }

    //subject code length is not 6 nor 7
    @Test
    void test7() {
        String expected = Subject.SUBJECT_CODE_INVALID_LENGTH;
        String actual = Subject.checkSubjectCode("CSEE4456s");
        assertEquals(actual, expected, actual);
    }

    //the first three characters of subject code has a number
    @Test
    void test8() {
        String expected = Subject.SUBJECT_CODE_HAS_NUMBERS;
        String actual = Subject.checkSubjectCode("C9E333");
        assertEquals(actual, expected, actual);
    }

     //the last three characters of subject code has a letter
    @Test
    void test9() {
        String expected = Subject.SUBJECT_CODE_HAS_LETTERS;
        String actual = Subject.checkSubjectCode("CSE33t");
        assertEquals(actual, expected, actual);
    }

    //subject code length is 7 and last character is not 's'
    @Test
    void test10() {
        String expected = Subject.SUBJECT_CODE_END;
        String actual = Subject.checkSubjectCode("CSE334r");
        assertEquals(actual, expected, actual);
    }

    //correct subject code of length 6
    @Test
    void test11() {
        String expected = "";
        String actual = Subject.checkSubjectCode("CSE334");
        assertEquals(actual, expected, actual);
    }

    //correct subject code of length 7
    @Test
    void test12() {
        String expected = "";
        String actual = Subject.checkSubjectCode("CSE322s");
        assertEquals(actual, expected, actual);
    }



}
