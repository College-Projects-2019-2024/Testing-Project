package Main;
import java.io.*;
import java.util.ArrayList;

public class fileIO {

    //function that opens the input file and returns the Subject object filled with data (if there is no errors)
    public static Subject readFile(String filename){
        
        BufferedReader reader;
        
        //to be returned
        Subject subb = null;

        try {
            reader = new BufferedReader(new FileReader(filename));
            
            //read a new line from the file
            String line = reader.readLine();
            
            for (int i = 0; line != null; i++) {
                
                //first line for subject
                if (i == 0) {
                    //if there is no subject in the first line return null
                    if(line.length()==0){
                        System.out.print("No subject data\nSubject data must be in first line");
                        reader.close();
                        return null;
                    }

                    else{
                        subb = new Subject(line);
                        //if subject data is correct continue and create a student array for it
                        if(subb.checkSubjectData().equals("")){
                            subb.students = new ArrayList<Student>();
                        }
                        //if not correct return null
                        else{
                            System.out.print("Error in subject data\n");
                            System.out.print(subb.checkSubjectData());
                            reader.close();
                            return null;
                        }
                        
                    }
                    
                }

                //the remaining lines in the file
                else {
                    //to avoid empty lines
                    if (line.length()>0) {
                        Student current = new Student(line);

                        //if student data is not correct
                        if(!current.checkStudentData().equals("")){
                            System.out.println("Student "+ i + ": ");
                            System.out.print(current.checkStudentData());
                        }

                        //if correct add to array of students
                        else{
                            subb.students.add(current);
                        } 
                    
                    }

                }
                line = reader.readLine();
            }
            reader.close();
            
        } catch (IOException e) {
            System.out.print("Invalid file name, file was not open\n");
        }

        //if it is null here then the for loop was not entered(empty file)
        if(subb == null){
            System.out.print("File is empty");
            return subb;
        }
        else{
            return subb;
        }
        

    }


    public static void writeFile(Subject sub) throws FileNotFoundException {
        FileWriter file = null;
        try{
            file = new FileWriter("output.txt");
            BufferedWriter writebuff = new BufferedWriter(file);
            writebuff.write("Subject name: " + sub.name +" Max mark: " + sub.fullMark + "\n");
            
            if(sub.students.size() == 0){
                writebuff.write("\nThere are no students\n");
                writebuff.close();
            }
            else{
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
            }
            
        }catch(IOException except){
            except.printStackTrace();
        }

    }
}
