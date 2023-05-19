package Main;

import java.io.FileNotFoundException;

public class App {
    public static void main(String[] args) throws FileNotFoundException {

        Subject sub = fileIO.readFile("Test\\Samplle.txt");
        if(sub == null){
            System.out.println("File is empty");
        }
        else{
            fileIO.writeFile(sub);
        }
        

    }
}
