package Main;

import java.io.FileNotFoundException;

public class App {
    public static void main(String[] args) throws FileNotFoundException {

        if(args.length==0) {
            Subject sub = fileIO.readFile("Test\\Samplle.txt");
            if (sub != null) {
                fileIO.writeFile(sub);
            }
        }
        else
        {
            Subject sub = fileIO.readFile(args[0]);
            if (sub != null) {
                fileIO.writeFile(sub);
            }

        }
        
    }
}
