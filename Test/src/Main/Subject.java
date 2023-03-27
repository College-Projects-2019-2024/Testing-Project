package Main;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Subject {
    //TODO()
    public static final String ERROR_MAX_DEGREE = "Error: Max degree must be one of the following values: 100.\n";
    public final static String STRING_EMPTY = "Error: Subject Name is empty.\n";
    public final static String SUBJECT_NAME_SPACE = "Error: Subject name starts with a space.\n";
    public  final static String SUBJECT_NAME_INVALID = "Error: Subject name must consist of alphabetic characters and spaces.\n";
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
                        if(!current.testStudent().equals("")){
                            System.out.println("Student "+ i + ": ");
                            System.out.print(current.testStudent());
                        }
                        else{
                            students.add(current);
                        } 
                    
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
    
    public static String checkSubjectName(String s)
    {   
        if(s.length()==0) return STRING_EMPTY;
        if(s.charAt(0)==' ') return SUBJECT_NAME_SPACE;
        for(char c : s.toCharArray())
        {
           if(!Character.isAlphabetic(c) || !Character.isAlphabetic(c)&&c!=' ')
                return SUBJECT_NAME_INVALID;
        }
        return "";              
    }
    public static String checkMaxDegree(int degree)
    {
        if(degree!=100) return ERROR_MAX_DEGREE;
        else return "";  
    }




    

}
