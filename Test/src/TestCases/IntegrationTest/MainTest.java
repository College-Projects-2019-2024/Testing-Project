package TestCases.IntegrationTest;
import java.io.FileNotFoundException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Main.App;

public class MainTest {
    
    @Test
    public void test1() throws FileNotFoundException{
        App.main(null);


    }

    @Test
    public void test2() throws FileNotFoundException{
        App.main(null);

        
    }
}
