import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {

        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("src\\Sample.txt"));
            String line = reader.readLine();

            for (int i = 0; line != null; i++) {
                line = reader.readLine();

                if (i == 0) {

                        continue;
                    
                } 
                else {
                    if (line != null) {
                        Student current = new Student(line);
                        System.out.println(current.getName() + '\t' + current.getStudentNumber() + '\t'
                                + current.calculateGPA() + '\t' + current.calculateGrade() + '\n');
                    }

                }

            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
