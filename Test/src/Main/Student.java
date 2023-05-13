package Main;



public class Student {
    private String name;
    private String number;
    private int activitiesMark;
    private int oral_practicalMark;
    private int midtermMark;
    private int finalMark;
    private int sum;

    //Error messages
    public final static String STRING_EMPTY = "Error: Student is empty.\n";
    public final static String STUDENT_NAME_SPACE = "Error: Student name starts with a space.\n";
    public final static String STUDENT_NAME_INVALID = "Error: Student name must consist of alphabetic characters and spaces.\n";
    public final static String STUDENT_NUMBER_CONTAIN = "Error: student number must be all digits until the last character.\n";
    public final static String STUDENT_NUMBER_END = "Error: student number must end with an alphabet/digit.\n";
    public final static String STUDENT_NUMBER_INVALID_LENGTH = "Error: student number length must be 8 characters.\n";
    public final static String ERROR_ACTIVITES_MARK = "Error: activities mark must be an integer from 1 to 10 of the full mark.\n";
    public final static String ERROR_MIDTERM_MARK = "Error: midterm mark must be an integer from 1 to 20 of the full mark.\n";
    public final static String ERROR_ORAL_MARK = "Error: Oral/Practical mark must be an integer from 1 to 10 of the full mark.\n";
    public final static String ERROR_FINAL_MARK = "Error: final exam mark must be an integer from 1 to 60 from the full mark.\n";
    public final static String ERROR_SUM = "Error: the sum of marks must be a positive number between 0 and 100.\n";
    public final static int    ERROR_GPA = -1;

    public Student(String s) {
        String[] attr = s.split(",");
        name = attr[0];
        number = attr[1];
        activitiesMark = Integer.valueOf(attr[2]);
        oral_practicalMark = Integer.valueOf(attr[3]);
        midtermMark = Integer.valueOf(attr[4]);
        finalMark = Integer.valueOf(attr[5]);
        sum = activitiesMark + oral_practicalMark + midtermMark + finalMark;

    }

    public static double calculateGPA(int sum) {
        if (sum >= 93)
            return 4.0;
        else if (sum >= 90 && sum < 93)
            return 3.7;
        else if (sum >= 84 && sum < 90)
            return 3.3;
        else if (sum >= 80 && sum < 84)
            return 3.0;
        else if (sum >= 76 && sum < 80)
            return 2.7;
        else if (sum >= 73 && sum < 76)
            return 2.3;
        else if (sum >= 70 && sum < 73)
            return 2.0;
        else if (sum >= 67 && sum < 70)
            return 1.7;
        else if (sum >= 64 && sum < 67)
            return 1.3;
        else if (sum >= 60 && sum < 64)
            return 1.0;
        else if(sum<60 && sum>0)
            return 0;
        else return ERROR_GPA;

        
    }
    public static String calculateGrade(int sum) {
        if (sum >= 97)
            return "A+";
        else if (sum >= 93 && sum < 97)
            return "A";
        else if (sum >= 90 && sum < 93)
            return "A-";
        else if (sum >= 84 && sum < 90)
            return "B+";
        else if (sum >= 80 && sum < 84)
            return "B";
        else if (sum >= 76 && sum < 80)
            return "B-";
        else if (sum >= 73 && sum < 76)
            return "C+";
        else if (sum >= 70 && sum < 73)
            return "C";
        else if (sum >= 67 && sum < 70)
            return "C-";
        else if (sum >= 64 && sum < 67)
            return "D+";
        else if (sum >= 60 && sum < 64)
            return "D";
        else if(sum<60 && sum>0)
            return "F";
        else return ERROR_SUM;
    }

    public String getName()
    {
        return name;
    }
    
    public String getStudentNumber()
    {
        return number;
    }

    public int getSum()
    {
        return sum;
    }
    
    public  static String checkStudentName(String s)
    {   
        if(s.length()==0) return STRING_EMPTY;
        if(s.charAt(0)==' ') return STUDENT_NAME_SPACE;
        for(char c : s.toCharArray())
        {
           if(!Character.isAlphabetic(c) || !Character.isAlphabetic(c)&&c!=' ')
                return STUDENT_NAME_INVALID;
        }
        return "";              
    }
    public static String checkStudentNumber(String s)
    {
        if(s.length()!=8) return STUDENT_NUMBER_INVALID_LENGTH;
        
        for(int i = 0; i<7; i++)
        {
            if(!Character.isDigit(s.charAt(i)))
            
             return STUDENT_NUMBER_CONTAIN;
              
        }
        if(!Character.isAlphabetic(s.charAt(s.length()-1)) && !Character.isDigit(s.charAt(s.length()-1)))
        
        return STUDENT_NUMBER_END;
    
        return "";   
    }
    public static String check_activities(int activitiesMark)
    {
        String result = "";
        if(activitiesMark<0 || activitiesMark>10)  result=ERROR_ACTIVITES_MARK;
        return result;
    }
    public static String check_oral(int oralMark)
    {
        String result = "";
        
        if(oralMark<0 || oralMark>10) result= ERROR_ORAL_MARK;
       
        return result;
    }
    public static String check_midterm(int midtermMark)
    {
        String result = "";
        
        if(midtermMark<0 || midtermMark>20) result=ERROR_MIDTERM_MARK;
        
        
        return result;
    }
    public  static String check_final(int finalMark)
    {
        String result = "";
        
        if(finalMark<0 || finalMark>60) result+=ERROR_FINAL_MARK;
        return result;
    }

    public  String testStudent(){
        String result = "";
        result+=checkStudentName(name);
        result+=checkStudentNumber(number);
        result+=check_activities(activitiesMark);
        result+=check_final(finalMark);
        result+=check_oral(oral_practicalMark);
        result+=check_midterm(midtermMark);

        return result;

    }

     
}
