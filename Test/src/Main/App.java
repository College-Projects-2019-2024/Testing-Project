package Main;

import java.io.FileNotFoundException;

public class App {
    public static void main(String[] args) throws FileNotFoundException {

        fileIO file = new fileIO();
        
        Subject sub = file.readFile("Test\\Samplle.txt");
        
        file.writeFile(sub);



    }
}
