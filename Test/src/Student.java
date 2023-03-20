
public class Student {
    private String name;
    private String number;
    private int activitiesMark;
    private int oral_practicalMark;
    private int midtermMark;
    private int finalMark;
    int sum;
    String STRING_EMPTY = "Error: Student is empty.";
    String STUDENT_NAME_SPACE = "Error: Student name starts with a space.";
    String STUDENT_NAME_INVALID = "Error: Student name must consist of alphabetic characters and Spaces.";
    String STUDENT_NUMBER_START = "Error: Student number must start with a number.";



    Student(String s) {
        String[] attr = s.split(",");
        name = attr[0];
        number = attr[1];
        activitiesMark = Integer.valueOf(attr[2]);
        oral_practicalMark = Integer.valueOf(attr[3]);
        midtermMark = Integer.valueOf(attr[4]);
        finalMark = Integer.valueOf(attr[5]);
        sum = activitiesMark + oral_practicalMark + midtermMark + finalMark;

    }

    double calculateGPA() {
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
        else
            return 0;
    }
    String calculateGrade() {
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
        else
            return "F";
    }
    String getName()
    {
        return name;
    }
    String getStudentNumber()
    {
        return number;
    }
    String checkStudentName()
    {   
        if(name.length()==0) return STRING_EMPTY;
        if(name.charAt(0)==' ') return STUDENT_NAME_SPACE;
        for(char c : name.toCharArray())
        {
           if(!Character.isAlphabetic(c) || !Character.isAlphabetic(c)&&c!=' ')
                return STUDENT_NAME_INVALID;
        }
        return "";              
    }
    String checkStudentNumber()
    {
        if(!Character.isDigit(number.charAt(0))){
        
            return STUDENT_NUMBER_START;
        }
        return "" ;
    
        
    }

    




}
