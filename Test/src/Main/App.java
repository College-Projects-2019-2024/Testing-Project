package Main;

public class App {
    public static void main(String[] args) {

        fileIO file = new fileIO();

        Subject sub = file.readFile("D:\\senior 1 comp\\testing\\Project\\Testing-Project\\Test\\Samplle.txt");
        
        file.writeFile(sub);
        
    }
}
