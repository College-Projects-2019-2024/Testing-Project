
public class Subject {
    String name;
    String code;
    int fullMark;
    Student[] student;
    


    public void readFile(String fileName){
        //first line: i=0

        //this.name = .... (from file)
        // this.code = ....  (from file)
        // this.fullMark = .....  (from file)


        //for each of the following lines: i >= 1  till the end of file 
          
        //this.student[i].name = student name (from line i in file)
        //this.student[i].number = student number (from line i in file)
        //this.student[i].activitiesMark = activitiesMark (from line i in file)
        //this.student[i].midtermMark = midtermMark (from line i in file)
        //this.student[i].oral_practicalMark = oral_practicalMark (from line i in file)
        //this.student[i].finalMark = finalMark (from line i in file)


    }

    //this will be in main and will take a subject type object
    public void calculateGPA(Subject sub){
        // object sub has array of students
        //each student has his own marks in this subject
        //for each student we will calculate his GPA in this subject
        // write each output in a line in the output file
    }


}
