package Main;
import java.util.ArrayList;


public class Subject {

    String name;
    String code;
    int fullMark;
    ArrayList<Student>students;
    
    //Error messages
    public static final String ERROR_MAX_DEGREE = "Error: Max degree must be one of the following values: 100.\n";
    public final static String STRING_EMPTY = "Error: Subject Name is empty.\n";
    public final static String SUBJECT_NAME_SPACE = "Error: Subject name starts with a space.\n";
    public  final static String SUBJECT_NAME_INVALID = "Error: Subject name must consist of alphabetic characters and spaces.\n";
    public final static String SUBJECT_CODE_INVALID_LENGTH = "Error: Subject code must be 6 or 7 characters.\n";
    public final static String SUBJECT_CODE_HAS_NUMBERS = "Error: The first three characters of the subject code must be alphabetic.\n";
    public final static String SUBJECT_CODE_HAS_LETTERS = "Error: The last three characters of the subject code must be numeric.\n";
    public final static String SUBJECT_CODE_END = "Error: The last character of a 7 characters subject code must be 's'\n";

    
    public Subject(String line){
        String[] attr = line.split(",");
        name = attr[0];
        code = attr[1];
        fullMark = Integer.valueOf(attr[2]);
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

    public static String checkSubjectCode(String s){
        if(s.length()!=6 && s.length()!=7) return SUBJECT_CODE_INVALID_LENGTH;

        for(int i = 0; i<3; i++){
            
            if(!Character.isAlphabetic(s.charAt(i))) return SUBJECT_CODE_HAS_NUMBERS;
        }
        for(int i = 3; i<6; i++){
            
            if(Character.isAlphabetic(s.charAt(i))) return SUBJECT_CODE_HAS_LETTERS;
        }
        if(s.length()==7 && s.charAt(s.length()-1) !='s') return SUBJECT_CODE_END;

        return "";

    }

    public static String checkMaxDegree(int degree)
    {
        if(degree!=100) return ERROR_MAX_DEGREE;
        else return "";  
    }



    // public void readFile(String filename){
    //     BufferedReader reader;
    //     students = new ArrayList<Student>();
    //     try {
    //         reader = new BufferedReader(new FileReader(filename));
    //         String line = "x";

    //         for (int i = 0; line != null; i++) {
    //             line = reader.readLine();

    //             if (i == 0) {
    //                 String[] attr = line.split(",");
    //                 name = attr[0];
    //                 code = attr[1];
    //                 fullMark = Integer.valueOf(attr[2]);
    //             } 
    //             else {
    //                 if (line != null) {
    //                     Student current = new Student(line);
    //                     if(!current.testStudent().equals("")){
    //                         System.out.println("Student "+ i + ": ");
    //                         System.out.print(current.testStudent());
    //                     }
    //                     else{
    //                         students.add(current);
    //                     } 
                    
    //                 }

    //             }

    //         }
        
    //         reader.close();
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }

    // }

    // public void writeFile(Subject sub){
    //     FileWriter file;
    //     try{
    //         file = new FileWriter("output.txt");
    //         BufferedWriter writebuff = new BufferedWriter(file);

    //         writebuff.write("Subject name: " + sub.name +"\t" +"\t");
    //         writebuff.write("Max mark: " + sub.fullMark);
    //         writebuff.write("\n");
    //         writebuff.write("\n");

    //         for(int i = 0; i<sub.students.size(); i++){
    //             writebuff.write(sub.students.get(i).getName()+"\t" );
    //             writebuff.write(sub.students.get(i).getStudentNumber()+"\t" );
    //             double x = Student.calculateGPA(sub.students.get(i).getSum());
    //             String s = Student.calculateGrade(sub.students.get(i).getSum());
    //             writebuff.write(x+"\t"+"\t");
    //             writebuff.write(s);
    //             writebuff.write("\n");

    //         }

    //         writebuff.close();
    //     }catch(IOException except){
    //         except.printStackTrace();
    //     }
    // }
    

}
