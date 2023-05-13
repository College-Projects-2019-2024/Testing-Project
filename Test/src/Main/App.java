package Main;

public class App {
    public static void main(String[] args) {

        fileIO file = new fileIO();

        Subject sub = file.readFile("Test\\Samplle.txt");
        
        file.writeFile(sub);
        
    }
}
