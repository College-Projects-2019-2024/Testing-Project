package TestCases.Whitebox;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import Main.Subject;

public class conditionCoverage {
    
    @Test
    void test1() {
        boolean expected = true;
        boolean actual = Subject.checkSubjectCode("CSE123") != Subject.SUBJECT_CODE_INVALID_LENGTH;
        assertEquals("Erroor in test 1", expected, actual);
    }


}
