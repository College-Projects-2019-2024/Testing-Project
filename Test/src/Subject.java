import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Subject {
    String name;
    String code;
    int fullMark;
    ArrayList<Student>students;
    
   
    public void readFile(String filename){
        BufferedReader reader;
        students = new ArrayList<Student>();
        try {
            reader = new BufferedReader(new FileReader(filename));
            String line = "x";

            for (int i = 0; line != null; i++) {
                line = reader.readLine();

                if (i == 0) {
                    String[] attr = line.split(",");
                    name = attr[0];
                    code = attr[1];
                    fullMark = Integer.valueOf(attr[2]);
                } 
                else {
                    if (line != null) {

                        Student current = new Student(line);
                        if(current.testStudent() != ""){
                            System.out.println("Student "+ i + ": ");
                            System.out.print(current.testStudent());
                        }
            
                        students.add(current);
                        
                        
                    
                    }

                }

            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

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
                double x = sub.students.get(i).calculateGPA();
                String s = sub.students.get(i).calculateGrade();
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
