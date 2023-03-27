package Main;

public class App {
    public static void main(String[] args) {
        Subject subb = new Subject();

        subb.readFile("Sample.txt");
        subb.writeFile(subb);
        
    }
}
