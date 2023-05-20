package TestCases.Whitebox;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import Main.Subject;

public class conditionCoverage {
    
    @Test
    void test1() {
        boolean expected = false;
        boolean actual = Subject.checkSubjectCode("CSE123") == Subject.SUBJECT_CODE_INVALID_LENGTH;
        assertEquals("Erroor in test 1", expected, actual);
    }

    @Test
    void test2() {
        boolean expected = false;
        boolean actual = Subject.checkSubjectCode("CSE123s") == Subject.SUBJECT_CODE_INVALID_LENGTH;
        assertEquals("Erroor in test 1", expected, actual);
    }

    @Test
    void test3() {
        boolean expected = true;
        boolean actual = Subject.checkSubjectCode("CSE11") == Subject.SUBJECT_CODE_INVALID_LENGTH;
        assertEquals("Erroor in test 1", expected, actual);
    }

    @Test
    void test5() {
        boolean expected = false;
        boolean actual = Subject.checkSubjectCode("CSE123") == Subject.SUBJECT_CODE_HAS_NUMBERS;
        assertEquals("Erroor in test 1", expected, actual);
    }
    @Test
    void test6() {
        boolean expected = true;
        boolean actual = Subject.checkSubjectCode("1CS223") == Subject.SUBJECT_CODE_HAS_NUMBERS;
        assertEquals("Erroor in test 1", expected, actual);
    }
    @Test
    void test7() {
        boolean expected = false;
        boolean actual = Subject.checkSubjectCode("CSE123") == Subject.SUBJECT_CODE_HAS_LETTERS;
        assertEquals("Erroor in test 1", expected, actual);
    }
    @Test
    void test8() {
        boolean expected = true;
        boolean actual = Subject.checkSubjectCode("CSEabc") == Subject.SUBJECT_CODE_HAS_LETTERS;
        assertEquals("Erroor in test 1", expected, actual);
    }
    @Test
    void test9() {
        boolean expected = false;
        boolean actual = Subject.checkSubjectCode("CSE123") == Subject.SUBJECT_CODE_END;
        assertEquals("Erroor in test 1", expected, actual);
    }
    @Test
    void test10() {
        boolean expected = false;
        boolean actual = Subject.checkSubjectCode("CSE123s") == Subject.SUBJECT_CODE_END;
        assertEquals("Erroor in test 1", expected, actual);
    }
    @Test
    void test11() {
        boolean expected = true;
        boolean actual = Subject.checkSubjectCode("CSE123a") == Subject.SUBJECT_CODE_END;
        assertEquals("Erroor in test 1", expected, actual);
        
    }


}
