package Main;
import java.io.*;
import java.util.ArrayList;

public class fileIO {

    
    public static Subject readFile(String filename){
        BufferedReader reader;
        Subject subb = null;

        try {
            reader = new BufferedReader(new FileReader(filename));
            String line = "x";

            for (int i = 0; line != null; i++) {
                line = reader.readLine();

                if (i == 0) {
                    subb = new Subject(line);
                    subb.students = new ArrayList<Student>();
                }

                else {

                    if (line != null && line !="" && line !="\n" && line.length()>0) {
                        Student current = new Student(line);
                        if(!current.checkStudentData().equals("")){
                            System.out.println("Student "+ i + ": ");
                            System.out.print(current.checkStudentData());
                        }
                        else{
                            subb.students.add(current);
                        } 
                    
                    }

                }

            }
            reader.close();
        } catch (IOException e) {
            System.out.print("Invalid file name, file was not open");
        }

        return subb;

    }


    public static void writeFile(Subject sub) throws FileNotFoundException {
        FileWriter file = null;
        try{
            file = new FileWriter("output.txt");
            BufferedWriter writebuff = new BufferedWriter(file);
            writebuff.write("Subject name: " + sub.name +" Max mark: " + sub.fullMark + "\n");
            writebuff.write("Student name Student number GPA Grade\n");

            for(int i = 0; i<sub.students.size(); i++){
                writebuff.write(sub.students.get(i).getName()+" " );
                writebuff.write(sub.students.get(i).getStudentNumber()+" " );

                double x = Student.calculateGPA(sub.students.get(i).getSum());
                String s = Student.calculateGrade(sub.students.get(i).getSum());

                writebuff.write(x+" ");
                writebuff.write(s);
                writebuff.write("\n");

            }

            writebuff.close();
        }catch(IOException except){
            except.printStackTrace();
        }

    }
}
