

public class App {
    public static void main(String[] args) {
        Subject subb = new Subject();

        subb.readFile("Test\\src\\Sample.txt");
        subb.writeFile(subb);
    }

}
