package Main;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class fileIO {
    Subject subb;
    
    public Subject readFile(String filename){
        BufferedReader reader;

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
                    if (line != null) {
                        Student current = new Student(line);
                        if(!current.checkStudent().equals("")){
                            System.out.println("Student "+ i + ": ");
                            System.out.print(current.checkStudent());
                        }
                        else{
                            subb.students.add(current);
                        } 
                    
                    }

                }

            }
        
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return subb;

    }


    public void writeFile(Subject sub){
        FileWriter file;
        try{
            file = new FileWriter("output.txt");
            BufferedWriter writebuff = new BufferedWriter(file);

            writebuff.write("Subject name: " + sub.name +"\t" +"\t");
            writebuff.write("Max mark: " + sub.fullMark);
            writebuff.write("\n");
            writebuff.write("\n");

            for(int i = 0; i<sub.students.size(); i++){
                writebuff.write(sub.students.get(i).getName()+"\t" );
                writebuff.write(sub.students.get(i).getStudentNumber()+"\t" );
                double x = Student.calculateGPA(sub.students.get(i).getSum());
                String s = Student.calculateGrade(sub.students.get(i).getSum());
                writebuff.write(x+"\t"+"\t");
                writebuff.write(s);
                writebuff.write("\n");

            }

            writebuff.close();
        }catch(IOException except){
            except.printStackTrace();
        }
    }
}
